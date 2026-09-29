package com.ty.LibraryManagementSystem.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.LibraryManagementSystem.dto.User;
import com.ty.LibraryManagementSystem.repository.UserRepository;

@Component
public class UserDao {

	@Autowired
	UserRepository repository;
	
	public User saveUser(User user)
	{
		return repository.save(user);
	}
	
	public Optional<User> viewUser(int id)
	{
		return repository.findById(id);
	}
	
	public User updateUser(int id, User user)
    {
        Optional<User> optional = repository.findById(id);

        if(optional.isPresent())
        {
            user.setId(id);
            return repository.save(user);
        }
        return null;
    }
	
	public boolean deleteUser(int id)
	{
	    Optional<User> optional = repository.findById(id);

	    if(optional.isPresent())
	    {
	        repository.delete(optional.get());
	        return true;
	    }
	    return false;
	}
}
