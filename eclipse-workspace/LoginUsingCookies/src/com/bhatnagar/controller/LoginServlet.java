package com.bhatnagar.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//	super.doGet(req, resp);
		String name = req.getParameter("uname");
		String pass = req.getParameter("upass");
		resp.setContentType("text/html");
		if (name.equalsIgnoreCase("shivam") && pass.equals("shivam123")) {
			resp.getWriter().print("<html><body><p>Welcome " + name + "</p></body></html>");
			RequestDispatcher rd = req.getRequestDispatcher("link.jsp");
			rd.include(req, resp);
			Cookie ck=new Cookie("cname",name);
			resp.addCookie(ck);

		} else {
			resp.getWriter().print("<html><body><p>Invalid Name and Password</p></body></html>");
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.include(req, resp);

		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		doGet(req, resp);
	}
}
