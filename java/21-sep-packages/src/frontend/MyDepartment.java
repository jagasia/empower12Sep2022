package frontend;

import model.Department;

public class MyDepartment extends Department{
	public void display()
	{
//		System.out.println(id);					//private
		System.out.println(name);					//protected
//		System.out.println(count);				//default
		System.out.println(companyName); 			//public
	}
}
