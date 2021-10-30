package com.hospital.config;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName ShiroConfig
 * @Description 请输入你的简化描述！
 * @Author 方聪
 * @Date 2019/6/6 10:49
 * @Version 1.0
 **/
import com.hospital.shiro.UserRealm;
import com.hospital.shiro.optionsFilter;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Description
 * @Author sgl
 * @Date 2018-06-11 17:23
 */
@Configuration
public class ShiroConfig {

    /**
     * 凭证匹配器,先不设计凭证认证加密系统，开发时先不涉及到密码加密
     * @return
     */
//    @Bean
//    public HashedCredentialsMatcher hashedCredentialsMatcher() {
//        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
//        //md5加密1次
//        hashedCredentialsMatcher.setHashAlgorithmName("md5");
//        hashedCredentialsMatcher.setHashIterations(1);
//        return hashedCredentialsMatcher;
//    }

    /**
     * 自定义realm
     *
     * @return
     */
    @Bean
    public UserRealm userRealm() {
        UserRealm userRealm = new UserRealm();
        // 不进行涉及其加密
        //userRealm.setCredentialsMatcher(hashedCredentialsMatcher());
        return userRealm;
    }

    /**
     * 安全管理器
     * 注：使用shiro-spring-boot-starter 1.4时，返回类型是SecurityManager会报错，
     * 直接引用shiro-spring则不报错
     *
     * @return
     */
    @Bean
    public DefaultWebSecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(userRealm());
        return securityManager;
    }


//    /**
//     * 设置过滤规则
//     *
//     * @param securityManager
//     * @return
//     */
//    @Bean
//    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager) {
//
//        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
//        shiroFilterFactoryBean.setSecurityManager(securityManager);
//
//        Map<String, Filter> filters = new HashMap<>();
//        optionsFilter authFilter =  new optionsFilter();
//        filters.put("authc",authFilter);
//        shiroFilterFactoryBean.setFilters(filters);
//
//        shiroFilterFactoryBean.setLoginUrl("/login");
//        shiroFilterFactoryBean.setSuccessUrl("/");
//        shiroFilterFactoryBean.setUnauthorizedUrl("/unauth");//不需要进行验证
//
//        // 必须设置 SecurityManager
//        shiroFilterFactoryBean.setSecurityManager(securityManager);
//
//        shiroFilterFactoryBean.setLoginUrl("/login");  // 如果不设置默认会自动寻找Web工程根目录下的"/login.jsp"页面
//        shiroFilterFactoryBean.setSuccessUrl("/");// 登录成功后要跳转的链接
//        shiroFilterFactoryBean.setUnauthorizedUrl("/unauth");//设置无权限跳转页面
//        Map<String, String> chains = new LinkedHashMap<>();
//
//        //管理员，需要角色权限 “admin”
//        //filterChainDefinitionMap.put("/admin/**", "roles[admin]");
//        //开放登陆接口
////        chains.put("/od/*", "anon");
//        chains.put("/logout","logout");//退出的返回的控制器
//        chains.put("/login", "anon");
//
//        //放行静态资源
//        chains.put("/static/**", "anon");
//        chains.put("/js/**", "anon");
//        //放行Swagger2页面
//        chains.put("/swagger-ui.html","anon");
//        chains.put("/swagger/**","anon");
//        chains.put("/webjars/**", "anon");
//        chains.put("/swagger-resources/**","anon");
//        chains.put("/v2/**","anon");
//        //需要门诊角色才可以访问
//        chains.put("/od/*", "roles[od]");
//        //主要这行代码必须放在所有权限设置的最后，不然会导致所有 url 都被拦截
//        chains.put("/**", "authc");
//
//        shiroFilterFactoryBean.setFilterChainDefinitionMap(chains);
//        return shiroFilterFactoryBean;
//    }


}
