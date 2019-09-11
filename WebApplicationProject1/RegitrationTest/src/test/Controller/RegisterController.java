package test.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name=request.getParameter("user");
	String email=request.getParameter("email");
	
	if(name.trim().length()==0)
	{response.sendRedirect("Retgistration.html?status=name cannot be empty");
	return ; }
	
	
	if(email.trim().length()==0)
	{
		response.sendRedirect("Retgistration.html?status=email cannot be empty");
	return ;
	}
	response.sendRedirect("Login.html");
	}

}
