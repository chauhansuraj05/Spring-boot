package com.ty.LibraryManagementSystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.LibraryManagementSystem.dao.BookDao;
import com.ty.LibraryManagementSystem.dto.Book;

@Service
public class BookService {

	@Autowired
	BookDao dao;
	
	public Book createBook(Book book)
	{
		return dao.saveBook(book);
	}
	
	public Book viewBook(int id)
	{
		Optional<Book> optional = dao.viewBook(id);
		
		if(optional.isPresent())
		{
			return optional.get();
		}
		
		return null;
	}
	
	public Book updateBook(int id , Book book)
	{
		return dao.updateBook(id, book);
	}
	
	public boolean deleteBook(int id)
	{
		return dao.deleteBook(id);
	}
}
