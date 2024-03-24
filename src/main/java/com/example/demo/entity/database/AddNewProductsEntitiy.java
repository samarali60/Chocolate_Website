package com.example.demo.entity.database;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="ADD-PRODUCTS")
public class AddNewProductsEntitiy {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String imgUrl;
	private String price;
}
