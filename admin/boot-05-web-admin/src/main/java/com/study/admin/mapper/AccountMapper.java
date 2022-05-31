package com.study.admin.mapper;

import com.study.admin.bean.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author RenAshbell
 * @create 2022-05-31-15:04
 */
@Mapper
public interface AccountMapper {

    public Account getAcct(Long id);

}
