package com.bhatnagar.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bhatnagar.dao.EmployeeDAO;
import com.bhatnagar.model.Employee;

@SuppressWarnings("serial")
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		String name = req.getParameter("name");
		String pass = req.getParameter("password");
		String email = req.getParameter("email");
		String country = req.getParameter("country");
		Employee emp = new Employee();
		emp.setName(name);
		emp.setPassword(pass);
		emp.setEmail(email);
		emp.setCountry(country);
		int status = EmployeeDAO.save(emp);
		if (status > 0) {
			pw.print("<html><body><p>Record inserted Successfully</p></body></html>");
			req.getRequestDispatcher("index.html").include(req, resp);
		} else {
			pw.print("<html><body><p>Unable to save the record</p></body></html>");

		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		doGet(req, resp);
	}
}
