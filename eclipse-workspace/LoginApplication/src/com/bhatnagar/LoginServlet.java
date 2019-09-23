package com.bhatnagar;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bhatnagar.service.LoginService;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//	super.doGet(req, resp);
		String name = req.getParameter("uname");
		String pass = req.getParameter("upass");
		LoginService loginService = new LoginService();
		boolean result = loginService.authenticate(name, pass);
		if (result) {
			resp.sendRedirect("success.jsp");
			return;
		} else {
			resp.sendRedirect("login.jsp");
			return;
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		doGet(req, resp);
	}
}