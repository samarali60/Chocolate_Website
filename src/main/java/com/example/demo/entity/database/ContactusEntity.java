package com.example.demo.entity.database;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name= "Contact")

public class ContactusEntity {
	@Id
	@GeneratedValue
	private int id ;
	private String name ;
	private Long phoneNumber;
	private String email;
	private String message;
	
}
