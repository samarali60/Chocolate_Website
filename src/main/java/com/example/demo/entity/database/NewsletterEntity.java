package com.example.demo.entity.database;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="NewsLetter")
public class NewsletterEntity {
	@Id
	@GeneratedValue
  private int id ;
	private String email ;
}
