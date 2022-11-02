package com.empower.ecom.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.empower.ecom.api.ProductApi;
import com.empower.ecom.entity.Merchant;
import com.empower.ecom.entity.Product;

@Controller
@RequestMapping("/product")
@MultipartConfig
public class ProductController {
	@Autowired
	private ProductApi papi;

	@GetMapping
	public String showProductPage()
	{
		return "product";				
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/productDml", params = "add")
	@ResponseBody
	public String addProduct(@RequestParam("name") String name, @RequestParam("description") String description,@RequestParam("price") Float price,@RequestParam("picture") MultipartFile file ,HttpSession session) throws IOException
	{
		Product product=new Product();
		product.setName(name);
		product.setDescription(description);
		product.setPrice(price);
		InputStream is = file.getInputStream();
		int len=is.available();
		byte[] picture=new byte[len];
		is.read(picture);
		product.setPicture(picture);
		
		if(session.getAttribute("merchant")==null)
			return "Not logged in as merchant";
		product.setMerchant((Merchant)session.getAttribute("merchant"));
		papi.addProduct(product);
		return "Added";
	}
	@RequestMapping(method = RequestMethod.POST, value = "/productDml", params = "update")
	@ResponseBody
	public String updateProduct(Product product, HttpSession session)
	{
		if(session.getAttribute("merchant")==null)
			return "Not logged in as merchant";
		product.setMerchant((Merchant)session.getAttribute("merchant"));
		papi.updateProduct(product);
		return "Updated";
	}
	@RequestMapping(method = RequestMethod.POST, value = "/productDml", params = "delete")
	@ResponseBody
	public String deleteProduct(Product product, HttpSession session)
	{
		if(session.getAttribute("merchant")==null)
			return "Not logged in as merchant";
		product.setMerchant((Merchant)session.getAttribute("merchant"));
		papi.deleteProduct(product.getId());
		return "Deleted";
	}
}
