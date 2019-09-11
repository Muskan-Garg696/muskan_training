package com.test.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.dao.UserDao;
import com.test.model.User;

@WebServlet("/RegisterService")
public class RegisterService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	private UserDao userDao;

    public void init() {
        userDao = new UserDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String firstName = request.getParameter("fname");
        String lastName = request.getParameter("lname");
        String address = request.getParameter("address");
        int contactno = Integer.parseInt(request.getParameter("contno"));
        String email=request.getParameter("email");
        String username = request.getParameter("uname");
        String pwd = request.getParameter("password");

        User usr = new User();
        usr.setFirst_name(firstName);
        usr.setLast_name(lastName);
        usr.setAddress(address);
        usr.setContactno(contactno);
        usr.setEmail(email);
        usr.setUname(username);
        usr.setPass(pwd);

        try {
            UserDao.registerUser(usr);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("UserDetails.jsp");
    }
}