package com.wang.dao;

import com.wang.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

//部门Dao
@Mapper
@Repository
public interface DepartmentMapping {

    List<Department> queryAllDepartmentList();

    Department queryDepartmentById(@Param("id") int id);

    int addDepartment(Map<String, Object> department);

    int updateDepartment(Map<String, Object> department);

    int deleteDepartment(@Param("id") int id);



}
