package dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Customer;
import oracle.jdbc.OracleDriver;

public class CustomerDao {
	private Connection retrieveConnection() throws SQLException {
		Driver driver=new oracle.jdbc.OracleDriver();
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
		return con;
	}
	
	//all related to database coding are done in dao
	public void addCustomer(Customer customer) throws SQLException {
		Connection con = retrieveConnection();
		PreparedStatement st = con.prepareStatement("INSERT INTO CUSTOMER VALUES(?,?,?)");
		st.setInt(1, customer.getId());
		st.setString(2, customer.getName());
		st.setString(3, customer.getPhone());
		st.executeUpdate();
		con.close();
	}

	
	public List<Customer> getAllCustomers() throws SQLException {
		Connection con = retrieveConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM Customer");
		List<Customer> customerList=new ArrayList<Customer>();
		while(rs.next())
		{
			Customer customer=new Customer(rs.getInt(1), rs.getString(2), rs.getString(3));
			customerList.add(customer);
		}
		con.close();
		return customerList;
	}
	public Customer findCustomerById(Integer id) throws SQLException {
		Connection con = retrieveConnection();
		PreparedStatement st = con.prepareStatement("SELECT * FROM Customer WHERE id=?");
		st.setInt(1, id);
		ResultSet rs = st.executeQuery();
		Customer customer=null;
		if(rs.next())
		{
			customer=new Customer(rs.getInt(1), rs.getString(2), rs.getString(3));
		}
		return customer;
	}
	
	public void updateCustomer(Customer customer) throws SQLException {
		Connection con = retrieveConnection();
		PreparedStatement st = con.prepareStatement("UPDATE CUSTOMER SET name=?, phone=? WHERE id=?");
		
		st.setString(1, customer.getName());
		st.setString(2, customer.getPhone());
		st.setInt(3, customer.getId());
		st.executeUpdate();
		con.close();
	}
	public void deleteCustomer(Integer id) throws SQLException {
		Connection con = retrieveConnection();
		PreparedStatement st = con.prepareStatement("DELETE FROM Customer WHERE id=?");
		
		st.setInt(1, id);
		st.executeUpdate();
		con.close();
	}
	
}
