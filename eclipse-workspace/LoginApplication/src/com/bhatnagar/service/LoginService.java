package com.bhatnagar.service;

import java.util.HashMap;

import com.bhatnagar.dto.User;

public class LoginService {

	HashMap<String, String> users = new HashMap<>();

	public LoginService() {
		users.put("shivam", "Shivam Bhatnagar");
		users.put("shivam1", "Shivam Bha3tnagar");
		users.put("shivam2", "Shivam Bhatn4agar");
	}

	public boolean authenticate(String userID, String password) {
		if (password.trim().equals("") || password == null)
			return false;
		return true;
	}

	public User getUserInfo(String userID) {
		User user = new User();
		user.setUserName(users.get(userID));
		user.setUserID(userID);
		return user;
	}

}