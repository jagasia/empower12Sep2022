package com.empower.hrms;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.empower.hrms.model.Product;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
//		ctx.scan("com");
//		ctx.refresh();
//		Product product = ctx.getBean(Product.class);
		Product product=(Product)ctx.getBean("prod");
		System.out.println(product);
	}

}
