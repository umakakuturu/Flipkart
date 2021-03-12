package com.example.flipkart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;
	private String productName;
	private double poductCost;
	private String productAvailability;
	private String productType;
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPoductCost() {
		return poductCost;
	}
	public void setPoductCost(double poductCost) {
		this.poductCost = poductCost;
	}
	public String getProductAvailability() {
		return productAvailability;
	}
	public void setProductAvailability(String productAvailability) {
		this.productAvailability = productAvailability;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

}
