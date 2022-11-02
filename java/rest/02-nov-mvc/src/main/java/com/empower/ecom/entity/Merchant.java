package com.empower.ecom.entity;

public class Merchant {
	private String email;
	private String password;
	private String name;
	private String shopName;
	private String shopAddress;
	
	public Merchant() {}

	
	public Merchant(String email, String password, String name, String shopName, String shopAddress) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.shopName = shopName;
		this.shopAddress = shopAddress;
	}


	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopAddress() {
		return shopAddress;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	
}
