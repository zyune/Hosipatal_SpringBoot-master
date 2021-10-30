package com.hospital.service.od;

import com.hospital.model.User;

import java.util.List;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName UserServer
 * @Description 用户的服务，应该是管理员管理
 * @Author 方聪
 * @Date 2019/6/12 13:26
 * @Version 1.0
 **/

public interface UserServer {
    /**
     * @Description  通过username查询用户的信息
     * @Date 13:35 2019/6/12
     * @Param [username]
     * @return com.hospital.model.admin.User
     **/
    User findByUserName(String username);

    List<String> selectPermissionByUserId(String username);
}
