package com.hospital.otherTest;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName TestShiro
 * @Description 测试简单的Shiro操作
 * @Author 方聪
 * @Date 2019/6/6 10:08
 * @Version 1.0
 **/

public class TestShiro {

    private static Logger logger = LoggerFactory.getLogger(TestShiro.class);
    public static void main(String[] args) {
        //IniSecurityManagerFactory方法在1.4.0中被注解标志为不建议使用
        //读取配置文件，初始化SecurityManager工厂
        IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        //获取securityManager 实例
        SecurityManager securityManager=factory.getInstance();
        //把securityManager实例绑定到SecurityUtils
        SecurityUtils.setSecurityManager(securityManager);
        //得到当前执行的用户
        Subject subject =  SecurityUtils.getSubject();//认证实体，当前进来的用户
        //创建token令牌，用户名/密码

        UsernamePasswordToken token = new UsernamePasswordToken("jack","12345");
        //身份认证
        try {
            subject.login(token);
            Session session = subject.getSession();
            session.setAttribute("username","jack");
            logger.info("登录成功！");
        } catch (AuthenticationException e) {
//login的接口函数  void login(AuthenticationToken var1) throws AuthenticationException;所以直接抓AuthenticationException异常即可
//身份认证失败即抛出此异常
            logger.info("登录失败！");
            e.printStackTrace();
        }







    }
}
