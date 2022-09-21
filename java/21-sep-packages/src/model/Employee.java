package model;

public class Employee {

	public void display()
	{
		Department d=new Department();
//		System.out.println(d.id);					//private
		System.out.println(d.name);					//protected
		System.out.println(d.count);				//default
		System.out.println(d.companyName); 			//public
	}
}
