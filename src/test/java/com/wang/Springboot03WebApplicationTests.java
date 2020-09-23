package com.wang;

import com.wang.pojo.Department;
import com.wang.pojo.Employee;
import com.wang.service.DepartmentServiceImpl;
import com.wang.service.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
@SpringBootTest
class Springboot03WebApplicationTests {

    @Autowired
    EmployeeServiceImpl employee;

    @Autowired
    DepartmentServiceImpl departmentService;

    @Test
    @GetMapping("/test")
    void contextLoads() {
//        List<Employee> employees = employee.queryAllEmployeeList();
//        for (Employee employee1 : employees) {
//            System.out.println(employee1);
//        }
//        List<Department> departments = departmentService.queryAllDepartmentList();
//        for (Department department : departments) {
//            System.out.println(department);
//        }
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("departmentName", "财务部");
//        departmentService.addDepartment(map);
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("id", 6);
//        map.put("departmentName", "外联部");
//        departmentService.updateDepartment(map);
//        departmentService.deleteDepartment(6);
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("lastName", "小明123");
//        map.put("email", "1234567@gmail.com");
//        map.put("gender", 0);
//        map.put("date", new Date(121345442));
//        map.put("did", 4);
//        map.put("id", 7);
//        employee.updateEmployee(map);
//        employee.deleteEmployee(6);
//        List<Department> departments = departmentService.queryAllDepartmentList();
//        for (Department department : departments) {
//            System.out.println(department);
//        }
    }

}
