package com.stackroute.quizify.searchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = "com.stackroute.quizify")
public class SeachServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeachServiceApplication.class, args);
	}

}

