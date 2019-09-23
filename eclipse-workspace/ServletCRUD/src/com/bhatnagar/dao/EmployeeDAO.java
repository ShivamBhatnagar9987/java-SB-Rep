package com.bhatnagar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.bhatnagar.model.Employee;

public class EmployeeDAO {
	public static Connection getConnection() throws SQLException {
		Connection con = null;
		try {
			ResourceBundle bundle = ResourceBundle.getBundle("db");
			// bundle.getBundle("");
			// mySQL
			Class.forName(bundle.getString("driver"));
			con = DriverManager.getConnection(bundle.getString("url") + "//" + bundle.getString("database"),
					bundle.getString("user"), bundle.getString("password"));

			// ORACLE

			/*
			 * Class.forName("oracle.jdbc.driver.OracleDriver"); con =
			 * DriverManager.getConnection("jdbc:oracle:thin:@localhost:1158:em", "system",
			 * "shivam");
			 */

//			PreparedStatement stmt = con.prepareStatement("select * from user905");
//			ResultSet rs = stmt.executeQuery();
//			while (rs.next()) {
//				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
//						+ " " + rs.getString(5));
//			}

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			con.close();
		}
		return con;
	}

	public static int save(Employee emp) {
		int status = 0;
		try {
			Connection con = EmployeeDAO.getConnection();
			PreparedStatement ps = con
					.prepareStatement("insert into user905(name,password,email,country) values(?,?,?,?");
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getPassword());
			ps.setString(3, emp.getEmail());
			ps.setString(4, emp.getCountry());
			status = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return status;

	}

	public static int update(Employee emp) {
		int status = 0;
		try {
			Connection con = EmployeeDAO.getConnection();
			PreparedStatement ps = con
					.prepareStatement("update user905 set name=?,password=?,email=?,country=? where id=?");
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getPassword());
			ps.setString(3, emp.getEmail());
			ps.setString(4, emp.getCountry());
			ps.setString(5, emp.getId());
			status = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return status;

	}

	public static int delete(Employee emp) {
		int status = 0;
		try {
			Connection con = EmployeeDAO.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from user905 where id=?");
			ps.setString(1, emp.getId());
			status = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return status;

	}

	public static Employee getEmployeeById(int id) {
		Employee emp = new Employee();
		try {
			Connection con = EmployeeDAO.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from user905 where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				emp.setId(rs.getString(1));
				emp.setName(rs.getString(2));
				emp.setPassword(rs.getString(3));
				emp.setEmail(rs.getString(4));
				emp.setCountry(rs.getString(5));

			}
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return emp;

	}

	public static List<Employee> getAllEmployees() {
		List<Employee> empList = new ArrayList<>();
		Employee emp = new Employee();
		try {
			Connection con = EmployeeDAO.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from user905");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				emp.setId(rs.getString(1));
				emp.setName(rs.getString(2));
				emp.setPassword(rs.getString(3));
				emp.setEmail(rs.getString(4));
				emp.setCountry(rs.getString(5));
				empList.add(emp);
			}
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return empList;

	}
}
