package com.bhatnagar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bhatnagar.model.User;

@Component
public class JdbcDaoImpl {
	@Autowired
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	private static Connection con = null;

	public User getUser() {
		User u = new User();
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from user905 where id=?");
			ps.setInt(1, 1);
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				u.setId(res.getString(1));
				u.setName(res.getString(2));
				u.setPassword(res.getString(3));
				u.setEmail(res.getString(4));
				u.setCountry(res.getString(5));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
}