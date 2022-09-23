package dao;

import java.sql.SQLException;

import entity.Customer;

public class App {

	public static void main(String[] args) throws SQLException {
		CustomerDao cdao=new CustomerDao();
		Customer customer=new Customer(1, "Shashank", "1234567890");
//		cdao.addCustomer(customer);
//		cdao.updateCustomer(customer);
//		cdao.deleteCustomer(1);
		System.out.println("Done");
	}

}
