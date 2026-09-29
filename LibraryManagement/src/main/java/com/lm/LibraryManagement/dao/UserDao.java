package com.lm.LibraryManagement.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.lm.LibraryManagement.dto.User;
import com.lm.LibraryManagement.repository.UserRepository;

@Component
public class UserDao {
	
	@Autowired
	UserRepository repository;

	public User createUser(User user) {
		return repository.save(user);
	}
	
	
}
