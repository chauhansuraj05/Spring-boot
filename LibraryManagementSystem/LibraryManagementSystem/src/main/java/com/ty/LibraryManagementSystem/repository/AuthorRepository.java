package com.ty.LibraryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.LibraryManagementSystem.dto.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
