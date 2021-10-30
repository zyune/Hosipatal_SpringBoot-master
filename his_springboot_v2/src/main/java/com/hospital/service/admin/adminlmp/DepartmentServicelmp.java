package com.hospital.service.admin.adminlmp;

import com.hospital.mapper.DepartmentMapper;
import com.hospital.model.Department;
import com.hospital.model.DepartmentExample;
import com.hospital.service.admin.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
 * @Author 邵婷
 * @Date 2019/6/22 10:18
 * @Version 1.0*/

@Service
public class DepartmentServicelmp implements DepartmentService {
    @Resource
    DepartmentMapper departmentMapper;

    DepartmentExample departmentExample = new DepartmentExample();
    DepartmentExample.Criteria criteria = departmentExample.createCriteria();

    @Override
    public  List<Department> findAll(){
      return  departmentMapper.selectByExample(departmentExample);
    }

    @Override
    public void addDepartment(Department department){
        departmentMapper.insert(department);
    }

    @Override
    public void updataDepartment(Department department){
        departmentMapper.updateByPrimaryKey(department);
    }

    @Override
    public void delDepartment(Department department){
        departmentMapper.deleteByPrimaryKey(department.getId());
    }




}
