package com.study.admin.service;

import com.study.admin.bean.City;
import com.study.admin.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author RenAshbell
 * @create 2022-05-31-15:58
 */
@Service
public class CityService {
    @Autowired
    CityMapper cityMapper;

    public City getById(Long id){
        return cityMapper.getById(id);
    }

    public void saveCity(City city){
        cityMapper.insert(city);
    }
}
