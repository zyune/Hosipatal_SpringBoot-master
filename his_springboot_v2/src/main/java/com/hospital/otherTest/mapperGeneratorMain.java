package com.hospital.otherTest;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName mapperGeneratorMain
 * @Description  mybatis的逆向生成工具，执行这个即可生成代码
 * @Author 方聪
 * @Date 2019/6/5 11:29
 * @Version 1.0
 **/


import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * mybatis逆向工程
 * 根据配置生成mybatis的实体类、接口以及映射Mapper.xml文件
 */

public class mapperGeneratorMain {

    public void generator() throws Exception {

        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //指定 逆向工程配置文件
        File configFile = new File("H:\\VUEm\\VUE\\cloud_hospital\\his_springboot\\src\\main\\resources\\generator\\generatorConfig.xml");
        //String xmlpath = this.getClass().getClassLoader().getResource("generator"+File.separator+"generatorConfig.xml").getPath();
        //File configFile = new File(xmlpath);
        System.out.println(configFile.getAbsolutePath());
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);

    }

    public static void main(String[] args) throws Exception {
        try {
            mapperGeneratorMain generatorSqlmap = new mapperGeneratorMain();
            generatorSqlmap.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}