package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.empower.ecom.model.Customer;
import com.empower.ecom.model.CustomerDao;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet({ "/CustomerServlet", "/customer" })
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String btn = request.getParameter("btn");
//		out.println(btn+" is clicked");
		CustomerDao cdao = new CustomerDao();
		Customer customer = null;
		String name, phone;
		Integer id;
		switch (btn) {
		case "Add":

			id = Integer.parseInt(request.getParameter("id"));
			name = request.getParameter("name");
			phone = request.getParameter("phone");
			customer=new Customer(id, name, phone);
			try {
				cdao.create(customer);
				out.print("Added");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "Update":
			
				id = Integer.parseInt(request.getParameter("id"));
				name = request.getParameter("name");
				phone = request.getParameter("phone");
				customer=new Customer(id, name, phone);
			try {
				cdao.update(customer);
				out.print("Updated");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;
		case "Delete":
			id = Integer.parseInt(request.getParameter("id"));
			try {
				cdao.delete(id);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		response.sendRedirect("index2.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
