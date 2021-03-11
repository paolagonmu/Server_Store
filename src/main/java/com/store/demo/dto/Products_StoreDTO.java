package com.store.demo.dto;

public class Products_StoreDTO {
	
	int price_product;
	String name_product;
	
	
	public Products_StoreDTO(int price_product, String name_product) {
		super();
		this.price_product = price_product;
		this.name_product = name_product;
	}
	
	

	public int getPrice_product() {
		return price_product;
	}
	public void setPrice_product(int price_product) {
		this.price_product = price_product;
	}
	public String getName_product() {
		return name_product;
	}
	public void setName_product(String name_product) {
		this.name_product = name_product;
	}
	
	

}
