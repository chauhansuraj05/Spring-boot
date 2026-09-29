package com.lm.LibraryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lm.LibraryManagement.dto.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
