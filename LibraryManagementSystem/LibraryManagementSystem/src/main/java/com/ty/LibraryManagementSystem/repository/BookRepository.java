package com.ty.LibraryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.LibraryManagementSystem.dto.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
