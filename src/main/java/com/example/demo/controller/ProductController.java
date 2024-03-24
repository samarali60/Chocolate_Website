package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.database.ContactusEntity;
import com.example.demo.entity.database.ProductEntity;
import com.example.demo.service.ProductService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ProductController {

	private final ProductService productService;


	@GetMapping("/chocolate")
	public String getAllProducts(Model model) {
		model.addAttribute("chocolates", productService.getAllProducts());
		model.addAttribute("contact", new ContactusEntity());
		model.addAttribute("add", new ProductEntity());
		return "chocolate";
	}

	@GetMapping("/about")
	public String getAbout(Model model) {
		model.addAttribute("contact", new ContactusEntity());
		model.addAttribute("add", new ProductEntity());
		return "about";
	}

	@GetMapping("/testimonial")
	public String testimonial(Model model) {
		model.addAttribute("contact", new ContactusEntity());
		model.addAttribute("add", new ProductEntity());
		return "testimonial";
	}

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("chocolates", productService.getAllProducts());
		model.addAttribute("contact", new ContactusEntity());
		model.addAttribute("add", new ProductEntity());
		return "index";
	}
	
	@GetMapping("/add-products")
	public String add(Model model) {
		model.addAttribute("chocolates", productService.getAllProducts());
		model.addAttribute("contact", new ContactusEntity());
		model.addAttribute("add", new ProductEntity());
		return "add-products";
	}
	
	@PostMapping("/add_products")
	public String saveProducts(@ModelAttribute("add") ProductEntity productEntity , Model model) {
		model.addAttribute("add", new ProductEntity());
		productService.saveProduct(productEntity);
		return "redirect:/chocolate";
	}


	
}
