package com.empower.hrms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.empower.hrms.model.Employee;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		Employee x = (Employee) ctx.getBean("employee");
		x.setName("Dheeraj Kumar");
		System.out.println(x);
		
		Employee y=(Employee) ctx.getBean("employee");
		System.out.println(y);
	}

}
