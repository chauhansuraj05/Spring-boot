package com.lm.LibraryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lm.LibraryManagement.dto.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer>{

}
