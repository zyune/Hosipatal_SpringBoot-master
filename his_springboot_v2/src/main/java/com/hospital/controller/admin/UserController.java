package com.hospital.controller.admin;

import com.hospital.model.RegistrationLevel;
import com.hospital.model.User;
import com.hospital.service.admin.UserService;
import com.hospital.utils.Result;
import com.hospital.utils.ResultCode;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/*
 * @Author 邵婷
 * @Date 2019/6/21 10:18
 * @Version 1.0*/
@RestController
@RequestMapping("/ad")
@Api(tags = {"邵婷负责的管理员部门管理所需的api文档"})
public class UserController {
    @Resource
    UserService userService;

    @GetMapping("/list")
    public Result list(){   //查询所有数据
        List <User> userlist = new ArrayList<>();
        return new Result(ResultCode.SUCCESS,userlist);
    }

    @GetMapping("/userlist")
    public Result userlist(){ //查询所有的数据
        List<User> users = userService.findAll();
        for(User user:users){
            System.out.println(user);
        }
        return new Result(ResultCode.SUCCESS,users);
    }

    //通过姓名查找用户
    @GetMapping("/getByName")
    public Result findByName(String name){
        User user = userService.findByName(name);
        return new Result(ResultCode.SUCCESS,user);
    }
    //通过用户名（账号）查找
    @GetMapping("/findByUsername")
    public Result findByUsername(String userName){
        User user = userService.findByUsername(userName);
        return new Result(ResultCode.SUCCESS,user);
    }
     //增加新用户
    @PostMapping("/addUser")
    public Result addUser(@RequestBody User user){
        userService.addUser(user);
        return new Result(ResultCode.SUCCESS);
    }
     //修改用户信息
    @PutMapping("/updataUser")
    public Result updataUser(@RequestBody User user){
        userService.updataUser(user);
        return new Result(ResultCode.SUCCESS);
    }
     //删除用户信息
    @DeleteMapping("delUserBykey")
    public Result delUser( User user){
        userService.delUser(user);
        return new Result(ResultCode.SUCCESS);
    }

    //查找所有挂号级别
    @GetMapping("/findAllRegistrationLevel")
    public  Result findAllRegistrationLevel(){
        List<RegistrationLevel> registrationLevels = userService.findAllRegistrationLevel();
        for(RegistrationLevel registrationLevel: registrationLevels){
            System.out.println(registrationLevel);
        }
        return new Result(ResultCode.SUCCESS,registrationLevels);
    }

    //添加挂号级别
    @PostMapping("/addRegistrationLevel")
    public Result  addRegistrationLevel(@RequestBody  RegistrationLevel registrationLevel){
        userService.addRegistrationLevel(registrationLevel);
        return new Result(ResultCode.SUCCESS);
    }

    //修改挂号级别
    @PutMapping("/updataRegistrationLevel")
    public Result updataRegistrationLevel(RegistrationLevel registrationLevel){
        userService.updataRegistrationLevel(registrationLevel);
        return new Result(ResultCode.SUCCESS);
    }

    //删除挂号级别
    @DeleteMapping("/delRegistrationLevel")
    public Result delRegistrationLevel(RegistrationLevel registrationLevel){
        userService.delRegistrationLevel(registrationLevel);
        return new Result(ResultCode.SUCCESS);
    }


}
