<%@page import="com.empower.ecom.entity.Customer"%>
<%@page import="com.empower.ecom.entity.Merchant"%>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="#">Link 1</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Link 2</a>
    </li>
  </ul>
  <!-- Navbar text-->
  <span class="navbar-text">
    <%
    	if(session.getAttribute("merchant")!=null)
    	{
    		Merchant merchant=(Merchant)session.getAttribute("merchant");
    		out.print("Welcome Merchant"+merchant.getName()+"<a href=/product >Product</a>. <a href=\"/logout\">Log out</a>");
    	}else if(session.getAttribute("customer")!=null)
    	{
    		Customer customer=(Customer)session.getAttribute("customer");
    		out.print("Welcome Customer:"+customer.getName()+" <a href=\"/logout\">Log out</a>");
    	}else
    	{
    		out.print("<a href=\"showLogin\">Login</a>");
    	}
    %>
  </span>
</nav>
