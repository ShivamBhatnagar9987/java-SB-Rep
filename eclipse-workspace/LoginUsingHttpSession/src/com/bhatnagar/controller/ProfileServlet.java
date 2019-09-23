package com.bhatnagar.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		HttpSession session = req.getSession(false);
		if (session != null) {
			String uname = (String) session.getAttribute("sname");
			resp.getWriter().print("<html><body><p> welcome" + uname + "</p></body></html>");
			req.getRequestDispatcher("link.jsp").include(req, resp);
		} else {
			resp.getWriter().print("<html><body><p> Please Login First</p></body></html>");
			req.getRequestDispatcher("login.jsp").include(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		doGet(req, resp);
	}

}
