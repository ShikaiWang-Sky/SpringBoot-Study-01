package com.wang.service;

import com.wang.dao.DepartmentMapping;
import com.wang.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentMapping departmentMapping;

    @Override
    public List<Department> queryAllDepartmentList() {
        return departmentMapping.queryAllDepartmentList();
    }

    @Override
    public Department queryDepartmentById(int id) {
        return departmentMapping.queryDepartmentById(id);
    }

    @Override
    public int addDepartment(Map<String, Object> department) {
        return departmentMapping.addDepartment(department);
    }

    @Override
    public int updateDepartment(Map<String, Object> department) {
        return departmentMapping.updateDepartment(department);
    }

    @Override
    public int deleteDepartment(int id) {
        return departmentMapping.deleteDepartment(id);
    }
}
