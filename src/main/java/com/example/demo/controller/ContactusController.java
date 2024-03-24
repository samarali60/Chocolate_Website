package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.database.ContactusEntity;
import com.example.demo.service.ContactService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ContactusController {
	private final ContactService contactService;

	@GetMapping("/contact")
	public String contact(Model model) {
		model.addAttribute("contact", new ContactusEntity());
		return "contact";
	}

//	@GetMapping("/add-contact")
//	public String getContact(Model model) {
//		model.addAttribute("contact", new ContactusEntity());
//		return "contact";
//	}

	@PostMapping("/add-contact")
	public String addContact(@ModelAttribute("contact") ContactusEntity contactusEntity) {
		contactService.saveService(contactusEntity);
		return "redirect:/contact";
	}

	@GetMapping("/feedBack")
	public String getFeedBack(Model model) {
		model.addAttribute("feedBack", new ContactusEntity());
		return "feedBack";
	}
	@PostMapping("/feedBack")
	public String saveFeedBack(@ModelAttribute("feedBack") ContactusEntity contactusEntity) {
		contactService.saveService(contactusEntity);
		return "feedBack";
	}


}
