package com.study.admin.mapper;

import com.study.admin.bean.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author RenAshbell
 * @create 2022-05-31-15:55
 */
@Mapper
public interface CityMapper {
    @Select("select * from city where id = #{id}")
    City getById(Long id);

    void insert(City city);
}
