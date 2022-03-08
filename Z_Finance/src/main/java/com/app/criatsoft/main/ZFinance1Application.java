package com.app.criatsoft.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@EntityScan(value = "com")
@SpringBootApplication
public class ZFinance1Application {

	public static void main(String[] args) {
		SpringApplication.run(ZFinance1Application.class, args);
	}

}
