package com.ty.LibraryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.LibraryManagementSystem.dto.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
