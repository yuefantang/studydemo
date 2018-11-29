package com.tyf.studydemo.redisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class StudydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudydemoApplication.class, args);
	}
}
