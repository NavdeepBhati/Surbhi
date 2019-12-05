package com.learn.streaming;

import java.util.List;

public class Product {
	
	private String name;
	private long qty;
	private double price;
	private String category;
	
	public Product(String name, long qty, double price, String category) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.category = category;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getQty() {
		return qty;
	}
	public void setQty(long qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public List<Product> getAllProducts(){
		return null;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public double getValue()
	{
		return getQty()*getPrice();
	}
}
