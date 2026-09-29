package com.ty.LibraryManagementSystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.LibraryManagementSystem.dao.UserDao;
import com.ty.LibraryManagementSystem.dto.User;

@Service
public class UserService {

	@Autowired
	UserDao dao;
	
	public User createUser(User user)
	{
		return dao.saveUser(user);
	}
	
	public User viewUser(int id)
	{
		Optional<User> optional = dao.viewUser(id);
		
		if(optional.isPresent())
		{
			return optional.get();
		}
		return null;  
	}
	
	public User updateUser(int id, User user)
    {
        return dao.updateUser(id, user);
    }
	
	public boolean deleteUser(int id)
	{
	    return dao.deleteUser(id);
	}
}
