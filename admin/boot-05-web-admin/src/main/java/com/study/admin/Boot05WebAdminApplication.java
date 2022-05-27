package com.study.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.PostMapping;

//@ServletComponentScan(basePackages= "com.study.admin")
@SpringBootApplication
public class Boot05WebAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(Boot05WebAdminApplication.class, args);
	}

}
