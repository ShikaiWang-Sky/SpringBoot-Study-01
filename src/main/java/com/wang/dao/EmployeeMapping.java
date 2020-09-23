package com.wang.dao;

import com.wang.pojo.Employee;
import jdk.dynalink.linker.LinkerServices;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

//员工Dao
@Mapper
@Repository
public interface EmployeeMapping {

    List<Employee> queryAllEmployeeList();

    Employee queryEmployeeById(@Param("id") int id);

    int addEmployee(Map<String, Object> employee);

    int deleteEmployee(@Param("id") int id);

    int updateEmployee(Map<String, Object> employee);
}
