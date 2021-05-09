package com.storage.mywarehouse.Entity;

public class Product implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private int productId;
	private String brand;
	private String type;
	private String description;
	private double price;

	public Product() {
	}

	public Product(int productId, String brand, String type, double price) {
		this.productId = productId;
		this.brand = brand;
		this.type = type;
		this.price = price;
	}

	public Product(int productId, String brand, String type, String description, double price) {
		this.productId = productId;
		this.brand = brand;
		this.type = type;
		this.description = description;
		this.price = price;
	}

	public Product(String brand, String type, String description, double price) {
		this.brand = brand;
		this.type = type;
		this.description = description;
		this.price = price;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
