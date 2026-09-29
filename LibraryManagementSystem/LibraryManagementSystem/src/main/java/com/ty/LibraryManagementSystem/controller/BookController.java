package com.ty.LibraryManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ty.LibraryManagementSystem.dto.Book;
import com.ty.LibraryManagementSystem.service.BookService;
import com.ty.LibraryManagementSystem.structure.ResponseStructure;

@RestController
public class BookController {

	@Autowired
	BookService service;
	
	@PostMapping("/books")
	public ResponseStructure<Book> createBook(@RequestBody Book book)
	{
		ResponseStructure<Book> responseStructure = new ResponseStructure<>();
		
		Book books = service.createBook(book);
		
		responseStructure.setMessage("Book Inserted");
		responseStructure.setStatusCode(200);
		responseStructure.setData(books);
		
		return responseStructure;
	}
	
	
	@GetMapping("/books")
	public ResponseStructure<Book> viewBook(@RequestParam int id)
	{
		ResponseStructure<Book> responseStructure = new ResponseStructure<>();
		
		Book book = service.viewBook(id);
		
		responseStructure.setMessage("Book Found");
		responseStructure.setStatusCode(200);
		responseStructure.setData(book);
		
		return responseStructure;
	}
	
	
	@PutMapping("/books")
	public ResponseStructure<Book> updateBook(@RequestParam int id , @RequestBody Book book)
	{
		ResponseStructure<Book> responseStructure = new ResponseStructure<>();
		
		Book updatedBook = service.updateBook(id, book);
		
		responseStructure.setMessage("Book Updated");
		responseStructure.setStatusCode(200);
		responseStructure.setData(updatedBook);
		
		return responseStructure;
	}
	
	
	@DeleteMapping("/books")
	public ResponseStructure<String> deleteBook(@RequestParam int id)
	{
		ResponseStructure<String> responseStructure = new ResponseStructure<>();
		
		boolean deleted = service.deleteBook(id);
		
		if(deleted)
		{
			responseStructure.setMessage("Book Deleted");
			responseStructure.setStatusCode(200);
			responseStructure.setData("Book deleted successfully");
		}
		else
		{
			responseStructure.setMessage("Book Not Found");
			responseStructure.setStatusCode(404);
			responseStructure.setData("Invalid Book Id");
		}
		
		return responseStructure;
	}
}