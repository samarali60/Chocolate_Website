package com.example.demo.entity.database;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name= "ORDERS")
public class OrderEntity {
	
	@Id
	@GeneratedValue
	private int id ;
	private String name ;
	private double salary;
}
