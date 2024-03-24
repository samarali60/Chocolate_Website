package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.database.ProductEntity;
import com.example.demo.service.ProductService;

@SpringBootApplication
public class DemoChoclotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoChoclotesApplication.class, args);
	}
	
@Bean
CommandLineRunner intit(ProductService productService) {
	return args ->{
		ProductEntity productEntity = new ProductEntity();
		productEntity.setName("Dark Choclot");
		productEntity.setPrice(400);
		productEntity.setImage("http://localhost:7955/images/chocolate1.png");
		
		productService.saveProduct(productEntity);
		
		ProductEntity productEntity2 = new ProductEntity();
		productEntity2.setName("white Choclot");
		productEntity2.setPrice(420);
		productEntity2.setImage("http://localhost:7955/images/about-img.png");
		productService.saveProduct(productEntity2);
		
		
		ProductEntity productEntity3 = new ProductEntity();
		productEntity3.setName("white Choclot");
		productEntity3.setPrice(420);
		productEntity3.setImage("http://localhost:7955/images/chocolate2.png");

		productService.saveProduct(productEntity3);
		
		
		
	};
	
}
}
