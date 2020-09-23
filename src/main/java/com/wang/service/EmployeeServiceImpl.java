package com.wang.service;

import com.wang.dao.EmployeeMapping;
import com.wang.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeMapping employeeMapping;

    @Override
    public List<Employee> queryAllEmployeeList() {
        return employeeMapping.queryAllEmployeeList();
    }

    @Override
    public Employee queryEmployeeById(int id) {
        return employeeMapping.queryEmployeeById(id);
    }

    @Override
    public int addEmployee(Map<String, Object> employee) {
        return employeeMapping.addEmployee(employee);
    }

    @Override
    public int deleteEmployee(int id) {
        return employeeMapping.deleteEmployee(id);
    }

    @Override
    public int updateEmployee(Map<String, Object> employee) {
        return employeeMapping.updateEmployee(employee);
    }
}
