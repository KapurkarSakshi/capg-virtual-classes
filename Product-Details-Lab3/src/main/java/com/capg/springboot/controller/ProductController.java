package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.model.ProductDetails;
import com.capg.springboot.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	
	@Autowired
	ProductService  service;
	
	@GetMapping("/id/{id}")
	public ProductDetails getProduct(@PathVariable int id) {
		return service.getProduct(id);
	}
	
	@GetMapping("all")
	public List<ProductDetails>  getAllProducts()
	{
		  return service.findAllProducts();
	}
	
	@PostMapping("add")
	public ProductDetails  createProduct(@RequestBody ProductDetails product)
	{
		return  service.createProduct(product);
	}
}
