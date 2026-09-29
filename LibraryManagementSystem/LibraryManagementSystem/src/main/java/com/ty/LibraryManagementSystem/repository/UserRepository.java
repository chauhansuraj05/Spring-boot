package com.ty.LibraryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.LibraryManagementSystem.dto.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
