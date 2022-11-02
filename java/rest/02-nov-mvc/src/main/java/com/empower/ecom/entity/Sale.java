package com.empower.ecom.entity;

import java.util.Date;

public class Sale {
	private Integer id;
	private Date saleDate;
	private Customer customer;
	private Product product;
	private Integer quantity;
	
	public Sale() {}

	public Sale(Integer id, Date saleDate, Customer customer, Product product, Integer quantity) {
		super();
		this.id = id;
		this.saleDate = saleDate;
		this.customer = customer;
		this.product = product;
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
