package com.wang.service;

import com.wang.pojo.Department;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface DepartmentService {

    List<Department> queryAllDepartmentList();

    Department queryDepartmentById(int id);

    int addDepartment(Map<String, Object> department);

    int updateDepartment(Map<String, Object> department);

    int deleteDepartment(int id);
}
