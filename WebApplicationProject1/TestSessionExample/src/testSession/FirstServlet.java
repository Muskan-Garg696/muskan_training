package testSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name=request.getParameter("name");
	//	String PASSWORD=request.getParameter("PASSWORD");
		
		out.println("<form action='SecondServlet'>");
		out.println("<input type= 'hidden' name='name' value="+name+">");
		//out.println("PASSWORD:<input type='PASSWORD' name='PASSWORD' >");
		out.println("<INPUT TYPE='SUBMIT'  VALUE='SUBMIT'>");
		
		out.println("</form>");
		
//	
//		if(PASSWORD.equals("1234"))
//		{
//			HttpSession session=request.getSession();
//			session.setAttribute("user1", name);
//			response.sendRedirect("SecondServlet");
//		}
//		//doGet(request, response);
	}

}
