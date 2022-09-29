package com.empower.hrms;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.empower.hrms.model.Employee;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
//		ctx.getBean("employee");
		Employee emp = (Employee)ctx.getBean("employee");
		System.out.println(emp);
	}

}
