package com.empower.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.empower.ecom.model.Product;
import com.empower.ecom.model.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService ps;
	
	@RequestMapping(method = RequestMethod.POST, value = "/product", params = "add")
	public ModelAndView addProduct(Product product) {
		ps.create(product);
		return showProductPage();
	}
	
	
	@GetMapping("/product/{id}")
	public Product findProductById(@PathVariable("id") Integer id) {
		return ps.read(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/product", params = "update")
	public ModelAndView modifyProduct(Product product) {
		ps.update(product);
		return showProductPage();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "product",params = "delete")
	public ModelAndView removeProduct(Product product) {
		ps.delete(product.getId());
		return showProductPage();
	}

	@GetMapping("/products")
	public ModelAndView showProductPage()
	{
		List<Product> products = ps.read();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("product");		
		mv.addObject("products",products);
		return mv;
	}
	
	@GetMapping("/select")
	public ModelAndView select(@RequestParam("id")Integer id)
	{
		Product product = ps.read(id);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("product");
		mv.addObject("product", product);
		return mv;
	}
}
