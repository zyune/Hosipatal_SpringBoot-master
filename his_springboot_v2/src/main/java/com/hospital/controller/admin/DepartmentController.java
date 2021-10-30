package com.hospital.controller.admin;


import com.hospital.model.Department;
import com.hospital.service.admin.DepartmentService;
import com.hospital.utils.Result;
import com.hospital.utils.ResultCode;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/*
 * @Author 邵婷
 * @Date 2019/6/22 10:18
 * @Version 1.0*/

@RestController
@RequestMapping("/ad")
@Api(tags = {"邵婷负责的管理员部门管理所需的api文档"})
public class DepartmentController {
    @Resource
    DepartmentService departmentService;

    @GetMapping("/findAllDepartments")
    public Result findAll(){
        List<Department> departments = departmentService.findAll();
        for(Department department:departments){
            System.out.println(department);
        }
        return new Result(ResultCode.SUCCESS,departments);

    }
    @PostMapping("/addDepartment")
    public Result addDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
        return new Result(ResultCode.SUCCESS);
    }

    @PutMapping("/updataDepartment")
    public Result updataDepartment(@RequestBody  Department department){
        departmentService.updataDepartment(department);
        return new Result(ResultCode.SUCCESS);
    }

    @DeleteMapping("/delDepartment")
    public Result delDepartment(Department department){
        departmentService.delDepartment(department);
        return new Result(ResultCode.SUCCESS);

    }

}
