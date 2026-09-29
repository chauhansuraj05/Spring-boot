package com.ty.LibraryManagementSystem.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.LibraryManagementSystem.dto.Author;
import com.ty.LibraryManagementSystem.repository.AuthorRepository;

@Component
public class AuthorDao {

	@Autowired
	AuthorRepository repository;
	
	public Author saveAuthor(Author author)
	{
		return repository.save(author);
	}
	
	public Optional<Author> viewAuthor(int id)
	{
		return repository.findById(id);
	}
	
	public Author updateAuthor(int id, Author author)
	{
		Optional<Author> optional = repository.findById(id);
		
		if(optional.isPresent())
		{
			author.setAuthor_id(id);
			return repository.save(author);
		}
		
		return null;
	}
	
	public boolean deleteAuthor(int id)
	{
		Optional<Author> optional = repository.findById(id);
		
		if(optional.isPresent())
		{
			repository.delete(optional.get());
			return true;
		}
		
		return false;
	}
}
