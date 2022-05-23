package com.study.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author RenAshbell
 * @create 2022-05-23-10:39
 */


/**
 * 只有在容器中的组件才会拥有SpringBoot提供的强大功能
 */
//@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;

    private Integer price;


}
