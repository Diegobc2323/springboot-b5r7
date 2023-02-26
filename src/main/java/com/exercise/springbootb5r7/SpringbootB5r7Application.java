package com.exercise.springbootb5r7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.exercise.*")
public class SpringbootB5r7Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootB5r7Application.class, args);
	}

}
