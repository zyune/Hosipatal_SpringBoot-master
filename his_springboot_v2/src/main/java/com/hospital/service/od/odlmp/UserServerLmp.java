package com.hospital.service.od.odlmp;

import com.hospital.mapper.UserMapper;
import com.hospital.model.User;
import com.hospital.model.UserExample;
import com.hospital.service.od.UserServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName UserServerLmp
 * @Description 请输入你的简化描述！
 * @Author 方聪
 * @Date 2019/6/12 13:28
 * @Version 1.0
 **/
@Service
public class UserServerLmp implements UserServer {
    @Resource
    UserMapper userMapper;
    /**
     * @Description  通过用户名选择用户
     * @Date 14:13 2019/6/12
     * @Param [username]
     * @return com.hospital.model.admin.User
     **/
    @Override
    public User findByUserName(String username) {
        UserExample selectByExample = new UserExample();
        UserExample.Criteria c = selectByExample.createCriteria();
        c.andUsernameEqualTo(username);
        User user = userMapper.selectByExample(selectByExample).get(0);
        return user;
    }
    /**
     * @Description 无用的一个方法，选择权限的
     * @Date 14:13 2019/6/12
     * @Param [username]
     * @return java.util.List<java.lang.String>
     **/
    @Override
    public List<String> selectPermissionByUserId(String username) {
        return null;
    }
}
