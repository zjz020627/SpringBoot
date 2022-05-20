package com.study.boot.config;

import com.study.boot.bean.Pet;
import com.study.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author RenAshbell
 * @create 2022-05-20-18:15
 */

@Configuration(proxyBeanMethods = true) // 告诉SpringBoot这是一个配置类
public class MyConfig {

    @Bean
    public User user01(){
        // user组件依赖了pet组件
        return new User("zhangsan",18,cat());
    }

    @Bean("tom")
    public Pet cat(){
        return new Pet("tomcat");
    }
}
