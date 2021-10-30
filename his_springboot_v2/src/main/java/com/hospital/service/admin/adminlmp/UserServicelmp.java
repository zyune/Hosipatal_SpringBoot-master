package com.hospital.service.admin.adminlmp;

import com.hospital.mapper.RegistrationLevelMapper;
import com.hospital.mapper.UserMapper;
import com.hospital.model.RegistrationLevel;
import com.hospital.model.RegistrationLevelExample;
import com.hospital.model.User;
import com.hospital.model.UserExample;
import com.hospital.service.admin.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/*
 * @Author 邵婷
 * @Date 2019/6/22 10:18
 * @Version 1.0*/

@Service
public class UserServicelmp implements UserService {
   @Resource
   UserMapper userMapper;
    UserExample userExample = new UserExample();
    UserExample.Criteria criteria = userExample.createCriteria();
    @Resource
    RegistrationLevelMapper registrationLevelMapper;
    RegistrationLevelExample registrationLevelExample = new RegistrationLevelExample();
    RegistrationLevelExample.Criteria criteria1 = registrationLevelExample.createCriteria();

    @Override
    public List<User>findAll(){
        //PageHelper.startPage(1, 1);
        return userMapper.selectByExample(userExample);
    }
    @Override
    public User findByName(String name){
        criteria.andNameEqualTo(name);
        User user = userMapper.selectByExample(userExample).get(0);
        return  user;
    }
    @Override
    public User findByUsername(String userName){
        criteria.andUsernameEqualTo(userName);
        User user = userMapper.selectByExample(userExample).get(0);
        return user;
    }


    @Override
    public void addUser(User user){
        userMapper.insert(user);
    }

    @Override
    public void updataUser(User user){
        userMapper.updateByPrimaryKey(user);
    }

    @Override  //根据用户id删除用户
    public void delUser(User user){
        userMapper.deleteByPrimaryKey(user.getId());
    }

    @Override    //查询所有的好好级别
    public List<RegistrationLevel> findAllRegistrationLevel(){
        return registrationLevelMapper.selectByExample(registrationLevelExample);
    }

    @Override //添加挂号级别
    public void addRegistrationLevel(RegistrationLevel registrationLevel){
        registrationLevelMapper.insert(registrationLevel);
    }

    @Override //修改挂号级别
    public  void updataRegistrationLevel(RegistrationLevel registrationLevel){
        registrationLevelMapper.updateByPrimaryKey(registrationLevel);
    }

    @Override //删除挂号级别
    public void delRegistrationLevel(RegistrationLevel registrationLevel){
        registrationLevelMapper.deleteByPrimaryKey(registrationLevel.getId());
    }





}
