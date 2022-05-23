package com.study.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.study.boot.bean.Car;
import com.study.boot.bean.Pet;
import com.study.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author RenAshbell
 * @create 2022-05-20-18:15
 */

@Import({User.class, DBHelper.class})
//@ConditionalOnBean(name = "tom")
@Configuration(proxyBeanMethods = true) // 告诉SpringBoot这是一个配置类
@ImportResource("classpath:beans.xml")
@EnableConfigurationProperties(Car.class)
// 1.开启Car属性配置绑定功能
// 2.把Car这个组件自动注册到容器中
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
