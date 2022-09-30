package com.empower.ecom.model;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {
	private Connection retrieveConnection() throws SQLException
	{
		Driver driver=new oracle.jdbc.driver.OracleDriver();
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
	}
	
	public int create(Customer customer) throws SQLException {
		String sql="INSERT INTO CUSTOMER VALUES(?,?,?)";
		Connection con = retrieveConnection();
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, customer.getId());
		st.setString(2, customer.getName());
		st.setString(3, customer.getPhone());
		int no=st.executeUpdate();
		con.close();
		return no;
	}
	public List<Customer> read() throws SQLException {
		String sql="SELECT * FROM CUSTOMER";
		Connection con = retrieveConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		List<Customer> customerList=new ArrayList<>();
		while(rs.next())
		{
			Customer customer=new Customer(rs.getInt(1), rs.getString(2), rs.getString(3));
			customerList.add(customer);
		}
		con.close();
		return customerList;
	}
	public Customer read(Integer id) throws SQLException {
		String sql="SELECT * FROM CUSTOMER WHERE id=?";
		Connection con = retrieveConnection();
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, id);
		ResultSet rs = st.executeQuery();
		Customer customer=null;
		if(rs.next())
		{
			customer=new Customer(rs.getInt(1), rs.getString(2), rs.getString(3));
		}
		con.close();
		return customer;
	}
	public int update(Customer customer) throws SQLException {
		String sql="UPDATE CUSTOMER SET name=?, phone=? WHERE id=?";		
		Connection con = retrieveConnection();
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, customer.getName());
		st.setString(2, customer.getPhone());
		st.setInt(3, customer.getId());
		int no=st.executeUpdate();
		con.close();
		return no;
	}
	public int delete(Integer id) throws SQLException {
		String sql="DELETE FROM CUSTOMER WHERE id=?";
		Connection con = retrieveConnection();
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, id);
		int no=st.executeUpdate();
		con.close();
		return no;
	}
	
	public static void main(String[] args) throws SQLException {
		Customer customer=new Customer(1, "Raja", "9898989898");
		CustomerDao cdao=new CustomerDao();
//		int result = cdao.create(customer);
		int result=cdao.update(customer);
		System.out.println(result+" row updated");
		
	}
}
