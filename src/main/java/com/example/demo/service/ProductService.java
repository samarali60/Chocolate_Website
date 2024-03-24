package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.database.ProductEntity;
import com.example.demo.entity.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	
	private final ProductRepository productRepository;
	
	 public List<ProductEntity> getAllProducts(){
		  return productRepository.findAll();
	  }
	  
	  public ProductEntity saveProduct(ProductEntity productEntity){
		  
		  return productRepository.save(productEntity);
	  }

}
