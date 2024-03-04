package com.cogent.AnnotationIOC;

import org.springframework.beans.factory.annotation.Autowired;

public class Product {

	private String name;
	private Brand brand;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Brand getBrand() {
		return brand;
	}

	@Autowired
	public void setBrand(Brand brand) {
		this.brand = brand;
	}

}
