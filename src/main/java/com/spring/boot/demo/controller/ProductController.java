package com.spring.boot.demo.controller;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.boot.demo.model.Product;
import com.spring.boot.demo.repository.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	public void run() {
		
		//1. Inserting
		
		Date dateCreated = new Date(2023,12,13);
		Date lastUpdated = new Date(2023,12,13);
		
		Product p1 = new Product("Ball", "A round ball.", new BigDecimal(25.00), true, "c:\\images\\ball.png");
		Product p2 = new Product("Bat", "A straight bat.", new BigDecimal(100.50), true, "c:\\images\\bat.png");
		Product p3 = new Product("Bat", "A flat bat.", new BigDecimal(125.50), true, "c:\\images\\bat.png");
		
		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
	}
	
}
