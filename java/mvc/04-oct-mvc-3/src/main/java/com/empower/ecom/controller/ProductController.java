package com.empower.ecom.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.annotation.MultipartConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.empower.ecom.model.Product;
import com.empower.ecom.model.ProductService;

@Controller
@MultipartConfig
public class ProductController {
	@Autowired
	private ProductService ps;
	
	@RequestMapping(method = RequestMethod.POST, value = "/product", params = "add")
	public ModelAndView addProduct(@RequestParam("name")String name,@RequestParam("price") Double price, @RequestParam("mfgDate")String dt,@RequestParam("picture") MultipartFile file) {
//		System.out.println(dt);
//		2020-12-30
		
		try {
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			Date mfgDate=sdf.parse(dt);
//			System.out.println(file.getBytes().length);
//			int len=file.getBytes().length;
			byte[]picture=file.getBytes();
			//add the product to db
			Product product=new Product(name, price, mfgDate, picture);
			ps.create(product);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		ps.create(product);
		return showProductPage();
	}
	
	
	@GetMapping("/product/{id}")
	public Product findProductById(@PathVariable("id") Integer id) {
		return ps.read(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/product", params = "update")
	public ModelAndView modifyProduct(@RequestParam("id")Integer id,@RequestParam("name")String name,@RequestParam("price") Double price, @RequestParam("mfgDate")String dt,@RequestParam("picture") MultipartFile file) {
try {
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			Date mfgDate=sdf.parse(dt);
//			System.out.println(file.getBytes().length);
//			int len=file.getBytes().length;
			byte[]picture=file.getBytes();
			//add the product to db
			Product product=new Product(id,name, price, mfgDate, picture);
			ps.update(product);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return showProductPage();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "product",params = "delete")
	public ModelAndView removeProduct(@RequestParam("id")Integer id) {
		ps.delete(id);
		return showProductPage();
	}

	@GetMapping("/products")
	public ModelAndView showProductPage()
	{
		List<Product> products = ps.read();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("product");		
		mv.addObject("products",products);
		mv.addObject("product", new Product());
		return mv;
	}
	
	@GetMapping("/select")
	public ModelAndView select(@RequestParam("id")Integer id)
	{
		List<Product> products = ps.read();
		Product product = ps.read(id);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("product");
		mv.addObject("products",products);
		mv.addObject("product", product);
		return mv;
	}
}
