package test.Age;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.java_cup.internal.runtime.Scanner;


@WebServlet("/CheckAge")
public class CheckAge extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{

		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String name=request.getParameter("name");
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		int price=0;
		int total;
    	//System.out.print("Enter operator (either +, -, * or /): ");
    //	operator = scanner.next().charAt(0);
    //	System.out.print("Enter number1 and number2 respectively: ");
    //	name = scanner.next();
    //	quantity = scanner.nextDouble();
    	
    	switch (name ) {
         case "BOOK"  :
        	 price=500;
           total = quantity * price;
           out.println(quantity + "*" + price + " = " + total);
           break;
         case "COPY":
        	 price=500;
        	 total = quantity * price;
           out.println(quantity + "*" + price + " = " + total);
           break;
         case "PEN":
        	 price=500;
        	 total = quantity * price;
        	 out.println(quantity + "*" + price + " = " + total);
           break;
         case "MARKERS":
        	 price=500;
        	 total = quantity * price;           
        	 out.println(quantity + "*" + price + " = " + total);
           break;
         case "COLORS":
        	 price=500;
        	 total = quantity * price;
        	out.println(quantity + "*" + price + " = " + total);
             break;
          case "BOARD":
        	  price=500;
        	  total = quantity * price;
        	 out.println(quantity + "*" + price + " = " + total);
             break;
           
         default: 
           out.println("Invalid selectionssssss!");
           break;
        }       
		
		if(   ( quantity<0)  )
		{
			out.println("please purchase something , because product is not present" );
			RequestDispatcher rd1=request.getRequestDispatcher("/Second");
			rd1.include(request, response);
			
			//response.sendRedirect("valid.html");
		}
		
	/*	else
			
		{

			//response.sendRedirect("invalid.html");
		}*/
	
	
	
	}

	

}
