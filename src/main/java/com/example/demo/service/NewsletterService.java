package com.example.demo.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.entity.database.NewsletterEntity;
import com.example.demo.entity.repository.NewsletterRepository;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Service
public class NewsletterService {
private final NewsletterRepository newsletterRepository;
public List<NewsletterEntity> getAllContact(){
	  return newsletterRepository.findAll();
}
public void saveNewsLetter(NewsletterEntity newsletterEntity) {
	newsletterRepository.save(newsletterEntity);
}
}
