package com.study.boot;

import com.study.boot.bean.Pet;
import com.study.boot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author RenAshbell
 * @create 2022-05-20-16:26
 */

/**
 * 主程序类
 * @SpringBootApplication：这是一个springBoot应用
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        // 1.返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        // 2.查看容器里的所有组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        Pet tom01 = run.getBean("tom", Pet.class);
        Pet tom02 = run.getBean("tom", Pet.class);

        System.out.println("组件:" + (tom01 == tom02));

        User user01 = run.getBean("user01", User.class);
        Pet tom = run.getBean("tom", Pet.class);

        System.out.println("用户的宠物是不是容器中的宠物(组件依赖)：" + (user01.getPet() == tom));

    }
}
