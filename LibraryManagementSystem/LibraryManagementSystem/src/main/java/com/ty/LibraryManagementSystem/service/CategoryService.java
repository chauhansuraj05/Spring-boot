package com.ty.LibraryManagementSystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.LibraryManagementSystem.dao.CategoryDao;
import com.ty.LibraryManagementSystem.dto.Category;

@Service
public class CategoryService {

	@Autowired
	CategoryDao dao;
	
	public Category createCategory(Category category)
	{
		return dao.saveCategory(category);
	}
	
	public Category viewCategory(int id)
	{
		Optional<Category> optional = dao.viewCategory(id);
		
		if(optional.isPresent())
		{
			return optional.get();
		}
		
		return null;
	}
	
	public Category updateCategory(int id, Category category)
	{
		return dao.updateCategory(id, category);
	}
	
	public boolean deleteCategory(int id)
	{
		return dao.deleteCategory(id);
	}
}