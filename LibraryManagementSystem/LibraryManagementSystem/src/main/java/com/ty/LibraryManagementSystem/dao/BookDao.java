package com.ty.LibraryManagementSystem.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.LibraryManagementSystem.dto.Book;
import com.ty.LibraryManagementSystem.repository.BookRepository;

@Component
public class BookDao {

	@Autowired
	BookRepository repository;
	
	public Book saveBook(Book book)
	{
		return repository.save(book);
	}
	
	public Optional<Book> viewBook(int id)
	{
		return repository.findById(id);
	}
	
	public Book updateBook(int id , Book book)
	{
		Optional<Book> optional = repository.findById(id);
		
		if(optional.isPresent())
		{
			book.setBook_id(id);
			return repository.save(book);
		}
		
		return null;
	}
	
	public boolean deleteBook(int id)
	{
		Optional<Book> optional = repository.findById(id);
		
		if(optional.isPresent())
		{
			repository.delete(optional.get());
			return true;
		}
		
		return false;
	}
}