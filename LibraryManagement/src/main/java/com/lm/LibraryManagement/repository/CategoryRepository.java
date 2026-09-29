package com.lm.LibraryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lm.LibraryManagement.dto.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
