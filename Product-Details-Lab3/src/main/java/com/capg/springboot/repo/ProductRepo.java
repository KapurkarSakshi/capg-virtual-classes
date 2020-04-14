package com.capg.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.springboot.model.ProductDetails;

@Repository
public interface ProductRepo extends JpaRepository<ProductDetails,Integer>{

}
