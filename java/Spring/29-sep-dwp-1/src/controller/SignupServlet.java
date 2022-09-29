package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignupServlet
 */
@WebServlet({ "/SignupServlet", "/signup" })
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username, password, cpassword, email, dob, gender, education;
		username=request.getParameter("username");
		password=request.getParameter("password");
		cpassword=request.getParameter("cpassword");
		email=request.getParameter("email");
		dob=request.getParameter("dob");
		gender=request.getParameter("gender");
		education=request.getParameter("education");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println(username+"<BR/>");
		out.println(password+"<BR/>");
		out.println(cpassword+"<BR/>");
		out.println(email+"<BR/>");
		out.println(dob+"<BR/>");
		out.println(gender+"<BR/>");
		out.println(education+"<BR/>");
	}

}
