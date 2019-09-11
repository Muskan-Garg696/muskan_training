package com.test.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("txtUserName");
        String pass=request.getParameter("txtPass");
        
        if(name.equalsIgnoreCase("manisha")&& pass.equalsIgnoreCase("123"))
        {
          RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
            request.setAttribute("uname", name);
            rd.forward(request, response);
        }
        else
        {//if name&pass not match then it display error page//
            response.sendRedirect("error.jsp");
        }
        
    }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
