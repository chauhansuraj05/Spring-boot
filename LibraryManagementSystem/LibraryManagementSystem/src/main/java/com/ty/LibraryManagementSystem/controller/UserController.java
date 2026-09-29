package com.ty.LibraryManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.LibraryManagementSystem.dto.User;
import com.ty.LibraryManagementSystem.service.UserService;
import com.ty.LibraryManagementSystem.structure.ResponseStructure;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@PostMapping("/users")
	public ResponseStructure<User> getUser(@RequestBody User user)
	{
		ResponseStructure<User> responseStructure = new ResponseStructure<User>();
		responseStructure.setMessage("User Inserted");
		responseStructure.setStatusCode(200);
		User users = service.createUser(user);
		responseStructure.setData(user);
		return responseStructure;
	}
	
	@GetMapping("/users")
	public ResponseStructure<User> getUserById(@RequestParam int id)
	{
	    ResponseStructure<User> responseStructure = new ResponseStructure<User>();

	    User user = service.viewUser(id);

	    responseStructure.setMessage("User Found");
	    responseStructure.setStatusCode(200);
	    responseStructure.setData(user);

	    return responseStructure;
	}
	
	@PutMapping("/users")
	public ResponseStructure<User> updateUser(@RequestParam int id, @RequestBody User user)
	{
	    ResponseStructure<User> responseStructure = new ResponseStructure<User>();

	    User updatedUser = service.updateUser(id, user);

	    responseStructure.setMessage("User Updated");
	    responseStructure.setStatusCode(200);
	    responseStructure.setData(updatedUser);

	    return responseStructure;
	}
	
	@DeleteMapping("/users")
	public ResponseStructure<String> deleteUser(@RequestParam int id)
	{
	    ResponseStructure<String> responseStructure = new ResponseStructure<String>();

	    boolean deleted = service.deleteUser(id);

	    if(deleted)
	    {
	        responseStructure.setMessage("User Deleted");
	        responseStructure.setStatusCode(200);
	        responseStructure.setData("User with id " + id + " deleted");
	    }
	    else
	    {
	        responseStructure.setMessage("User Not Found");
	        responseStructure.setStatusCode(404);
	        responseStructure.setData("Invalid User Id");
	    }

	    return responseStructure;
	}
}
