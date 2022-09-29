package com.empower.hrms;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.empower.hrms.config.MyConfiguration;
import com.empower.hrms.model.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
//    	ctx.scan("com.empower.hrms");
//    	ctx.refresh();
//    	Product product = ctx.getBean(Product.class);
    	Product product=(Product) ctx.getBean("prd");
//    	product.setId(12);
//    	product.setName("Pencil");
//    	product.setPrice(5.0);
    	System.out.println(product);
    	
        System.out.println( "Hello World!" );
    }
}
