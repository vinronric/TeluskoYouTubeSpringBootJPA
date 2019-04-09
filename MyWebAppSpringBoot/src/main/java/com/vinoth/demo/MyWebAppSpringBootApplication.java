package com.vinoth.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.vinoth")
public class MyWebAppSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyWebAppSpringBootApplication.class, args);
	}

}
