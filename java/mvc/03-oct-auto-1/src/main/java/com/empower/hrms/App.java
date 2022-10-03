package com.empower.hrms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.empower.hrms.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
    	Customer customer= (Customer) ctx.getBean("customer");
    	System.out.println(customer);
    }
}
