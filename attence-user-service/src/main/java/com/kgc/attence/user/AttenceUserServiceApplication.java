package com.kgc.attence.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.kgc.attence.user.mapper")
@SpringBootApplication
public class AttenceUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttenceUserServiceApplication.class, args);
	}

}
