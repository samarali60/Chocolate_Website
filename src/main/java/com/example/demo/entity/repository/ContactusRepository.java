package com.example.demo.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.database.ContactusEntity;
@Repository
public interface ContactusRepository extends JpaRepository<ContactusEntity, Integer>{

}
