package com.study.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author RenAshbell
 * @create 2022-05-20-18:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pet {

    private String name;
    private Double weight;

}
