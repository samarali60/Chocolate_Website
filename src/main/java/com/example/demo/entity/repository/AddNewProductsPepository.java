package com.example.demo.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.database.AddNewProductsEntitiy;
@Repository
public interface AddNewProductsPepository extends JpaRepository<AddNewProductsEntitiy, Integer>{

}
