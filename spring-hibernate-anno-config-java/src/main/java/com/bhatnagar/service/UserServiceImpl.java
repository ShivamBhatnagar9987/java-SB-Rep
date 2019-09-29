package com.bhatnagar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhatnagar.model.User;
import com.bhatnagar.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {
	UserRepository userRepository;

	public UserRepository getUserRepository() {
		return userRepository;
	}

	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User findAll() {
		return userRepository.findAll();
	}

}
