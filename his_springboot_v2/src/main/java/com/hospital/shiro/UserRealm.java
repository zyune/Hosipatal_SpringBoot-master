package com.hospital.shiro;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName UserRealm
 * @Description 请输入你的简化描述！
 * @Author 方聪
 * @Date 2019/6/6 10:48
 * @Version 1.0
 **/


import com.hospital.model.User;
import com.hospital.service.od.UserServer;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;

import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description
 * @Author sgl
 * @Date 2018-06-11 17:07
 */
public class UserRealm extends AuthorizingRealm {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserRealm.class);
    @Autowired
    private UserServer sysUserService;

    /**
     * 认证 是登陆。
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws RuntimeException {

        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        System.out.println("token的内容："+token);
        if(token.getUsername() == null)
            return null;
        else {
            User sysUser = sysUserService.findByUserName(token.getUsername());
            if (sysUser == null) {
                LOGGER.info(token.getUsername() + "(无效用户)尝试登陆,登陆host地址:" + token.getHost());
                return null;
            }
            LOGGER.info("doGetAuthenticationInfo");
            //它会把查询到的用户密码放置到这个对象，然后于token中的userPassword进行比较
            System.out.println(sysUser.toString());
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
                    sysUser, sysUser.getUserpassword().toCharArray(),
                    this.getName());

            if (simpleAuthenticationInfo == null)
                LOGGER.info(token.getUsername() + "(用户)尝试登陆,输入的无效密码为:" + token.getPassword());

            return simpleAuthenticationInfo;
        }
    }


    /**
     * 授权 , 进行授权行为
     *
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //登陆成功的用户
        User sysUser = (User) principals.getPrimaryPrincipal();
        //进行添加角色，不进行资源权限认证，仅仅进行角色认证

//        List<String> sysPermissions = sysUserService.selectPermissionByUserId(sysUser.getUsername());
//        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        info.addStringPermissions(sysPermissions);
//
//        LOGGER.info("sysUser:"+sysUser.getUsername()+"认证成功，认证的角色为:"+);
//        return info;

        //给当前用户授权的权限（功能权限、角色）
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        //xslde用户拥有user角色
        User user = (User) principals.getPrimaryPrincipal();
        //真实开发中，角色权限从数据库获取
        if (user.getRole() == 1){
            //设置该用户拥有门诊医生角色
            authorizationInfo.addRole("od");
            //设置该用户拥有delete权限
//            authorizationInfo.addStringPermission("od:query");
        } else if (user.getRole() == 2){
            //xxxx
            authorizationInfo.addRole("rt");
//            //设置该用户拥有delete权限
//            authorizationInfo.addStringPermission("zs:delete");
        }
        return authorizationInfo;


    }


}
