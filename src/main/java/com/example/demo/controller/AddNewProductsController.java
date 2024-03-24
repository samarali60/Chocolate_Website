package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.database.AddNewProductsEntitiy;

import com.example.demo.service.AddNewProductsService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class AddNewProductsController {
private final AddNewProductsService addAddNewProductsService;
@GetMapping("/addproducts")
public String getNewProducts(Model model) {
	model.addAttribute("add", new AddNewProductsEntitiy());
	return "add-products";
}

//@PostMapping("/addproducts")
//public String saveProducts(@ModelAttribute("add") AddNewProductsEntitiy addNewProductsEntitiy) {
//	addAddNewProductsService.saveAllproductsByUser(addNewProductsEntitiy);
//	return "redirect:/";
//}
//@GetMapping("/chocolate")
//public String getAllProducts(Model model) {
//	model.addAttribute("chocolates", addServiceAddNewProductsService.getAllproductsByUser());
//	model.addAttribute("add", new AddNewProductsEntitiy());
//	return "chocolate";
//}
//
//@GetMapping("/about")
//public String getAbout(Model model) {
//	model.addAttribute("add", new AddNewProductsEntitiy());
//	return "about";
//}
//
//@GetMapping("/testimonial")
//public String testimonial(Model model) {
//	model.addAttribute("add", new AddNewProductsEntitiy());
//	return "testimonial";
//}
//
//@GetMapping("/")
//public String index(Model model) {
//	model.addAttribute("chocolates", addServiceAddNewProductsService.getAllproductsByUser());
//	model.addAttribute("add", new AddNewProductsEntitiy());
//	return "index";
//}


}
