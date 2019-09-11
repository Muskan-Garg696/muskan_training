package test.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String un=request.getParameter("user");
		String pwd=request.getParameter("password");
		if(un.equals("muskan"))
		{
			out.print("welcome , "+un);
			HttpSession session=request.getSession(true);
			
			session.setAttribute("user" , un);
			session.setMaxInactiveInterval(30);
			response.sendRedirect("Home.jsp");
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			out.println("<font color=red>Either user name or password is wrong</font>");
			rd.include(request, response);
		}
	}

}
