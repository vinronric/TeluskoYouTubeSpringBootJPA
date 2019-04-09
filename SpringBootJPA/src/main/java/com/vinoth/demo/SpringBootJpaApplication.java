package com.vinoth.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan({"com.vinoth","com.vinoth.daoreposiroty","com.vinoth.controller","com.vinoth.service"})
@ComponentScan({"com.vinoth.model","com.vinoth"})
@EnableJpaRepositories("com.vinoth.daoreposiroty")
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}

}
