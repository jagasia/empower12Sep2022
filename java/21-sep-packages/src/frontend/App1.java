package frontend;

import model.Department;
import model.Employee;

public class App1{
	public static void main(String[] args) {
		Employee e=new Employee();
		Department d=new Department();
//		System.out.println(d.id);					//private
//		System.out.println(d.name);					//protected
//		System.out.println(d.count);				//default
		System.out.println(d.companyName); 			//public
	}
}
