package com.ty.LibraryManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ty.LibraryManagementSystem.dto.Author;
import com.ty.LibraryManagementSystem.service.AuthorService;
import com.ty.LibraryManagementSystem.structure.ResponseStructure;

@RestController
public class AuthorController {

	@Autowired
	AuthorService service;
	
	@PostMapping("/authors")
	public ResponseStructure<Author> createAuthor(@RequestBody Author author)
	{
		ResponseStructure<Author> responseStructure = new ResponseStructure<>();
		
		Author authors = service.createAuthor(author);
		
		responseStructure.setMessage("Author Inserted");
		responseStructure.setStatusCode(200);
		responseStructure.setData(authors);
		
		return responseStructure;
	}
	
	
	@GetMapping("/authors")
	public ResponseStructure<Author> viewAuthor(@RequestParam int id)
	{
		ResponseStructure<Author> responseStructure = new ResponseStructure<>();
		
		Author author = service.viewAuthor(id);
		
		responseStructure.setMessage("Author Found");
		responseStructure.setStatusCode(200);
		responseStructure.setData(author);
		
		return responseStructure;
	}
	
	
	@PutMapping("/authors")
	public ResponseStructure<Author> updateAuthor(@RequestParam int id , @RequestBody Author author)
	{
		ResponseStructure<Author> responseStructure = new ResponseStructure<>();
		
		Author updatedAuthor = service.updateAuthor(id, author);
		
		responseStructure.setMessage("Author Updated");
		responseStructure.setStatusCode(200);
		responseStructure.setData(updatedAuthor);
		
		return responseStructure;
	}
	
	
	@DeleteMapping("/authors")
	public ResponseStructure<String> deleteAuthor(@RequestParam int id)
	{
		ResponseStructure<String> responseStructure = new ResponseStructure<>();
		
		boolean deleted = service.deleteAuthor(id);
		
		if(deleted)
		{
			responseStructure.setMessage("Author Deleted");
			responseStructure.setStatusCode(200);
			responseStructure.setData("Author deleted successfully");
		}
		else
		{
			responseStructure.setMessage("Author Not Found");
			responseStructure.setStatusCode(404);
			responseStructure.setData("Invalid Author Id");
		}
		
		return responseStructure;
	}
}