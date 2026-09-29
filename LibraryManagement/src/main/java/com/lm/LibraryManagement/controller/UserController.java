package com.lm.LibraryManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lm.LibraryManagement.dto.User;
import com.lm.LibraryManagement.service.UserService;
import com.lm.LibraryManagement.structure.ResponseStructure;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class UserController {
	
	@Autowired
	UserService service;

	@PostMapping("/users")
	public ResponseStructure<User> createUser( User user){
		ResponseStructure<User> responseStructure = new ResponseStructure<User>();
		responseStructure.setStatusCode(200);
		responseStructure.setMessage("User Created");
		User users = service.saveUser(user);
		responseStructure.setData(users);
		
		return responseStructure;
	}
	
}
