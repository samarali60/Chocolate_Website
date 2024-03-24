package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.database.AddNewProductsEntitiy;
import com.example.demo.entity.repository.AddNewProductsPepository;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Service
public class AddNewProductsService {
public final AddNewProductsPepository addNewProductsPepository;

public List<AddNewProductsEntitiy> getAllproductsByUser(){
	  return addNewProductsPepository.findAll();
}
public void saveAllproductsByUser(AddNewProductsEntitiy addNewProductsEntitiy) {
	addNewProductsPepository.save(addNewProductsEntitiy);
}
}
