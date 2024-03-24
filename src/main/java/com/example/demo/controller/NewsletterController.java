package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.database.NewsletterEntity;
import com.example.demo.service.NewsletterService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class NewsletterController {
  
	private final NewsletterService newsletterService;
	
	@PostMapping("/newsletter")
	public String addNewsLetter(@ModelAttribute("newsletter") NewsletterEntity newsletterEntity) {
		newsletterService.saveNewsLetter(newsletterEntity);
		return "redirect:/";
	}
	
}
