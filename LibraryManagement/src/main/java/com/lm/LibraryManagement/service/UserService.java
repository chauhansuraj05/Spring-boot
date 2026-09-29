package com.lm.LibraryManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lm.LibraryManagement.dao.UserDao;
import com.lm.LibraryManagement.dto.User;

@Service
public class UserService {

	@Autowired
	UserDao dao;
	
	public User saveUser(User user) {
		return dao.createUser(user);
	}
}
