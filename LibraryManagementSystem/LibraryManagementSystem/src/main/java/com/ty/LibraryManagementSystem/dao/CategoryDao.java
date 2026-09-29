package com.ty.LibraryManagementSystem.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.LibraryManagementSystem.dto.Category;
import com.ty.LibraryManagementSystem.repository.CategoryRepository;

@Component
public class CategoryDao {

	@Autowired
	CategoryRepository repository;
	
	public Category saveCategory(Category category)
	{
		return repository.save(category);
	}
	
	public Optional<Category> viewCategory(int id)
	{
		return repository.findById(id);
	}
	
	public Category updateCategory(int id, Category category)
	{
		Optional<Category> optional = repository.findById(id);
		
		if(optional.isPresent())
		{
			category.setCategory_id(id);
			return repository.save(category);
		}
		
		return null;
	}
	
	public boolean deleteCategory(int id)
	{
		Optional<Category> optional = repository.findById(id);
		
		if(optional.isPresent())
		{
			repository.delete(optional.get());
			return true;
		}
		
		return false;
	}
}