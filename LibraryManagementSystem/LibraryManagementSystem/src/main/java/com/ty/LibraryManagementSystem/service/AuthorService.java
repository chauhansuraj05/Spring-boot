package com.ty.LibraryManagementSystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.LibraryManagementSystem.dao.AuthorDao;
import com.ty.LibraryManagementSystem.dto.Author;

@Service
public class AuthorService {

	@Autowired
	AuthorDao dao;
	
	public Author createAuthor(Author author)
	{
		return dao.saveAuthor(author);
	}
	
	public Author viewAuthor(int id)
	{
		Optional<Author> optional = dao.viewAuthor(id);
		
		if(optional.isPresent())
		{
			return optional.get();
		}
		
		return null;
	}
	
	public Author updateAuthor(int id, Author author)
	{
		return dao.updateAuthor(id, author);
	}
	
	public boolean deleteAuthor(int id)
	{
		return dao.deleteAuthor(id);
	}
}