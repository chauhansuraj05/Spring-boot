package com.ty.LibraryManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ty.LibraryManagementSystem.dto.Category;
import com.ty.LibraryManagementSystem.service.CategoryService;
import com.ty.LibraryManagementSystem.structure.ResponseStructure;

@RestController
public class CategoryController {

	@Autowired
	CategoryService service;
	
	@PostMapping("/categories")
	public ResponseStructure<Category> createCategory(@RequestBody Category category)
	{
		ResponseStructure<Category> responseStructure = new ResponseStructure<>();
		
		Category categories = service.createCategory(category);
		
		responseStructure.setMessage("Category Inserted");
		responseStructure.setStatusCode(200);
		responseStructure.setData(categories);
		
		return responseStructure;
	}
	
	
	@GetMapping("/categories")
	public ResponseStructure<Category> viewCategory(@RequestParam int id)
	{
		ResponseStructure<Category> responseStructure = new ResponseStructure<>();
		
		Category category = service.viewCategory(id);
		
		responseStructure.setMessage("Category Found");
		responseStructure.setStatusCode(200);
		responseStructure.setData(category);
		
		return responseStructure;
	}
	
	
	@PutMapping("/categories")
	public ResponseStructure<Category> updateCategory(@RequestParam int id, @RequestBody Category category)
	{
		ResponseStructure<Category> responseStructure = new ResponseStructure<>();
		
		Category updatedCategory = service.updateCategory(id, category);
		
		responseStructure.setMessage("Category Updated");
		responseStructure.setStatusCode(200);
		responseStructure.setData(updatedCategory);
		
		return responseStructure;
	}
	
	
	@DeleteMapping("/categories")
	public ResponseStructure<String> deleteCategory(@RequestParam int id)
	{
		ResponseStructure<String> responseStructure = new ResponseStructure<>();
		
		boolean deleted = service.deleteCategory(id);
		
		if(deleted)
		{
			responseStructure.setMessage("Category Deleted");
			responseStructure.setStatusCode(200);
			responseStructure.setData("Category deleted successfully");
		}
		else
		{
			responseStructure.setMessage("Category Not Found");
			responseStructure.setStatusCode(404);
			responseStructure.setData("Invalid Category Id");
		}
		
		return responseStructure;
	}
}