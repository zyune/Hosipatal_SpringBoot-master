package com.hospital.service.admin;

import com.hospital.model.Department;

import java.util.List;
/*
 * @Author 邵婷
 * @Date 2019/6/22 10:18
 * @Version 1.0*/
public interface DepartmentService {
    List<Department> findAll();
    void addDepartment(Department department);
    void updataDepartment(Department department);
    void delDepartment(Department department);

}
