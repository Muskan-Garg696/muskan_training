package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
/*protected void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException
	
	{
		System.out.println("get method calles");
		doPost(req, res);
	}*/
protected void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException ,IOException
	
	{PrintWriter out=res.getWriter();
	res.setContentType("text/html");
	int num1=Integer.parseInt(req.getParameter("num1"));
	int num2=Integer.parseInt(req.getParameter("num2"));
	int num3 ;
	num3=num1 +num2 ;
	out.println("<html>");
	out.println("<head>");
	
	out.println("<title>");
	out.println("welcome");
	out.println("</title>");
	out.println("</head>");
	out.println("<body>");
	out.println("Result is<h1>" +num3+"</h1>");
	out.println("</body>");
	out.println("</html>");
		//System.out.println("post method called");
		
	}
}
