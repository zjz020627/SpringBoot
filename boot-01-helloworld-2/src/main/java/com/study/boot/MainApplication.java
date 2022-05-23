package com.study.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
        SpringApplication.run(MainApplication.class, args);
    }
}
