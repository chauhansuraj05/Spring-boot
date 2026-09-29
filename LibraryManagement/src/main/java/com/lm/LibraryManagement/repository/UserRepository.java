package com.lm.LibraryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lm.LibraryManagement.dto.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
