package com.hospital.service.admin;


import com.hospital.model.RegistrationLevel;
import com.hospital.model.User;

import java.util.List;

/*
 * @Author 邵婷
 * @Date 2019/6/21 10:18
 * @Version 1.0*/
public interface UserService {
    List<User> findAll();
    User findByName(String name); //根据用户姓名进行查询
    User findByUsername(String userName); //通过账号查询用户个人信息
    void addUser(User user);//添加用户
    void updataUser(User user);//修改用户信息
    void delUser(User user);//删除用户信息
    List<RegistrationLevel> findAllRegistrationLevel();  //查询所有的挂号级别
    void addRegistrationLevel(RegistrationLevel registrationLevel); //添加挂号级别
    void updataRegistrationLevel(RegistrationLevel registrationLevel);//修改挂号级别
    void delRegistrationLevel(RegistrationLevel registrationLevel);

}
