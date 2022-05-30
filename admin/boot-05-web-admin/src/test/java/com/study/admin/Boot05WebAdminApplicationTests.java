package com.study.admin;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;


@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest
class Boot05WebAdminApplicationTests {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	DataSource dataSource;
	@Test
	void contextLoads() {
		Long aLong = jdbcTemplate.queryForObject("select count(*) from t_fruit", Long.class);
		log.info("记录总数：{}",aLong);

		log.info("数据源类型：{}",dataSource.getClass());
	}

}
