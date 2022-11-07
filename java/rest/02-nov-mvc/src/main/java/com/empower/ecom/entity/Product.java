package com.empower.ecom.entity;

import org.apache.tomcat.util.codec.binary.Base64;

public class Product {
	private Integer id;
	private String name;
	private String description;
	private Float price;
	private byte[] picture;
	private Merchant merchant;
	
	public Product(Integer id, String name, String description, Float price, byte[] picture) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.picture = picture;
	}
	
	public Product() {}
	
	

	public Product(Integer id, String name, String description, Float price, byte[] picture, Merchant merchant) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.picture = picture;
		this.merchant = merchant;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public byte[] getPicture() {
		return picture;
	}
	
	public String getPicture1()
	{
		return Base64.encodeBase64String(picture);
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	
}
