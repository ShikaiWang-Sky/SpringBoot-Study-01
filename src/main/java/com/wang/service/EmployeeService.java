package com.wang.service;

import com.wang.pojo.Employee;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface EmployeeService {

    List<Employee> queryAllEmployeeList();

    Employee queryEmployeeById(int id);

    int addEmployee(Map<String, Object> employee);

    int deleteEmployee(int id);

    int updateEmployee(Map<String, Object> employee);

}
