package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(DemoApplication.class, args);
		
			System.out.println("Let's inspect the beans provided by Spring Boot:");

		}
	
}
