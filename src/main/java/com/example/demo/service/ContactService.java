package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.entity.database.ContactusEntity;
import com.example.demo.entity.repository.ContactusRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ContactService {
private final ContactusRepository contactusRepository;
	
	public List<ContactusEntity> getAllContact(){
		  return contactusRepository.findAll();
	  }
	public void saveService(ContactusEntity contactusEntity) {
		contactusRepository.save(contactusEntity);
	}
}
