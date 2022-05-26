package com.study.admin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author RenAshbell
 * @create 2022-05-25-17:16
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private String userName;

    private String password;
}
