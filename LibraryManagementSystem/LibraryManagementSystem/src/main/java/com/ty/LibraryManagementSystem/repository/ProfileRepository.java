package com.ty.LibraryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.LibraryManagementSystem.dto.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer>{

}
