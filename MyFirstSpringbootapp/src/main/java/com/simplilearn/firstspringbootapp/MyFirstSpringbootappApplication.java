package com.simplilearn.firstspringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.simplilearn.firstspringbootapp")
public class MyFirstSpringbootappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringbootappApplication.class, args);
	}

}
