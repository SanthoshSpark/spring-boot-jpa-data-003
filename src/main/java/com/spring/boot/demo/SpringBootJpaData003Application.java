package com.spring.boot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.boot.demo.controller.ProductController;

@SpringBootApplication
public class SpringBootJpaData003Application implements CommandLineRunner  {
	
	@Autowired
	private ProductController productController;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaData003Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		productController.run();
		
	}

}
