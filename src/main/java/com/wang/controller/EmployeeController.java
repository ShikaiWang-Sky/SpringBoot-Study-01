package com.wang.controller;

import com.wang.dao.DepartmentMapping;
import com.wang.dao.EmployeeMapping;
import com.wang.pojo.Department;
import com.wang.pojo.Employee;
import com.wang.service.DepartmentService;
import com.wang.service.DepartmentServiceImpl;
import com.wang.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

@Controller
public class EmployeeController {

    //自动装配ServiceImpl可以调用其中的方法
    @Autowired
    EmployeeServiceImpl employeeService;

    @Autowired
    DepartmentServiceImpl departmentService;

    @RequestMapping("/employees")
    public String list(Model model) {
        List<Employee> employees = employeeService.queryAllEmployeeList();
        model.addAttribute("employees", employees);

        return "employees/list";
    }

    //只能用get方式获得请求, 前端请求添加员工, 这里进行页面的跳转
    @GetMapping("/addEmployee")
    public String toAddPage(Model model) {
        //查出所有部门的信息
        List<Department> departments = departmentService.queryAllDepartmentList();
        model.addAttribute("departments", departments);

        return "employees/add";
    }

    //只能用post方式获得请求, 与上面的get方式的url一致, 是RestFul风格
    @PostMapping("/addEmployee")
    public String addEmployee(Employee employee) {
        //添加的操作
        //调用底层业务方法, 保存员工信息
        HashMap<String, Object> map = new HashMap<>();
        map.put("lastName", employee.getLastName());
        map.put("email", employee.getEmail());
        map.put("gender", employee.getGender());
        map.put("date", employee.getDate());
        map.put("did", employee.getDepartment().getId());
        employeeService.addEmployee(map);
        return "redirect:/employees";
    }

    //去员工的修改页面
    @GetMapping("/employee/{id}")
    public String toUpdateEmployee(@PathVariable("id")Integer id, Model model) {
        //查出原来的数据
        Employee employee = employeeService.queryEmployeeById(id);
        model.addAttribute("employee", employee);
        //为了显示部门列表, 这里查出来全部的部门
        List<Department> departments = departmentService.queryAllDepartmentList();
        model.addAttribute("departments", departments);
        return "employees/update";
    }

    @PostMapping("/updateEmployee")
    public String updateEmployee(Employee employee) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("lastName", employee.getLastName());
        map.put("email", employee.getEmail());
        map.put("gender", employee.getGender());
        map.put("date", employee.getDate());
        map.put("did", employee.getDid());
        map.put("id", employee.getId());
        int i = employeeService.updateEmployee(map);
        System.out.println(i);
        return "redirect:/employees";
    }

    //删除员工
    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable("id")Integer id) {
        employeeService.deleteEmployee(id);
        return "redirect:/employees";
    }
}
