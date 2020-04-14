package com.capg.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springboot.model.ProductDetails;
import com.capg.springboot.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo repo;
	
	
	public ProductDetails getProduct(int id) {
		return repo.getOne(id);
	}
	
	public List<ProductDetails> findAllProducts() { 
		return repo.findAll();
	}
	
	public ProductDetails createProduct(ProductDetails product) {
		return repo.saveAndFlush(product);
	}

}
