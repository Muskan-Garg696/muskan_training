package includeTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ForwardController")
public class ForwardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un=request.getParameter("username");
		String pass=request.getParameter("pwd");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<b>welcome to forward controller</b>");
		out.println("user name is"+un + "and " + "password is" +pass);
		
		out.println("<br>");
		
		out.println("<br>");
		
		out.println("<br>");
		
		
		RequestDispatcher dis =request.getRequestDispatcher("/TestController");
		dis.forward(request, response);
		
		
		
		
	}

}
