package com.capg.springboot.model;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@Table(name="prdct_tbl")
public class ProductDetails {


		  @Id
		 // @Column(name="ProductId")
		  //@GeneratedValue
		  private int productId;
		  
		//  @Column(name="ProductName",length=15)
		  private String productName;
		  
		 // @Column(name="ProductPrice")
		  private double price ;

		public int getProductId() {
			return productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
		  
		  
	}

