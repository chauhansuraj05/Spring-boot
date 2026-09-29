package com.ty.LibraryManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.LibraryManagementSystem.dto.Profile;
import com.ty.LibraryManagementSystem.service.ProfileService;
import com.ty.LibraryManagementSystem.structure.ResponseStructure;

@RestController
public class ProfileController {

	@Autowired
	ProfileService service;
	
	@PostMapping("/profiles")
	public ResponseStructure<Profile> createProfile(@RequestBody Profile profile)
	{
		ResponseStructure<Profile> responseStructure = new ResponseStructure<>();
		
		Profile profiles = service.createProfile(profile);
		
		responseStructure.setMessage("Profile Inserted");
		responseStructure.setStatusCode(200);
		responseStructure.setData(profiles);
		
		return responseStructure;
	}
	
	
	@GetMapping("/profiles")
	public ResponseStructure<Profile> viewProfile(@RequestParam int id)
	{
		ResponseStructure<Profile> responseStructure = new ResponseStructure<>();
		
		Profile profile = service.viewProfile(id);
		
		responseStructure.setMessage("Profile Found");
		responseStructure.setStatusCode(200);
		responseStructure.setData(profile);
		
		return responseStructure;
	}
	
	
	@PutMapping("/profiles")
	public ResponseStructure<Profile> updateProfile(@RequestParam int id , @RequestBody Profile profile)
	{
		ResponseStructure<Profile> responseStructure = new ResponseStructure<>();
		
		Profile updatedProfile = service.updateProfile(id, profile);
		
		responseStructure.setMessage("Profile Updated");
		responseStructure.setStatusCode(200);
		responseStructure.setData(updatedProfile);
		
		return responseStructure;
	}
	
	
	@DeleteMapping("/profiles")
	public ResponseStructure<String> deleteProfile(@RequestParam int id)
	{
		ResponseStructure<String> responseStructure = new ResponseStructure<>();
		
		boolean deleted = service.deleteProfile(id);
		
		if(deleted)
		{
			responseStructure.setMessage("Profile Deleted");
			responseStructure.setStatusCode(200);
			responseStructure.setData("Profile deleted successfully");
		}
		else
		{
			responseStructure.setMessage("Profile Not Found");
			responseStructure.setStatusCode(404);
			responseStructure.setData("Invalid Profile Id");
		}
		
		return responseStructure;
	}
}
