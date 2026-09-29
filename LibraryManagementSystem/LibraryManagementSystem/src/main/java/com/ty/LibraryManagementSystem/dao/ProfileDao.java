package com.ty.LibraryManagementSystem.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.LibraryManagementSystem.dto.Profile;
import com.ty.LibraryManagementSystem.repository.ProfileRepository;

@Component
public class ProfileDao {

	@Autowired
	ProfileRepository repository;
	
	public Profile saveProfile(Profile profile)
	{
		return repository.save(profile);
	}
	
	public Optional<Profile> viewProfile(int id)
	{
		return repository.findById(id);
	}
	
	public Profile updateProfile(int id, Profile profile)
	{
		Optional<Profile> optional = repository.findById(id);
		
		if(optional.isPresent())
		{
			profile.setProfile_id(id);
			return repository.save(profile);
		}
		
		return null;
	}
	
	public boolean deleteProfile(int id)
	{
		Optional<Profile> optional = repository.findById(id);
		
		if(optional.isPresent())
		{
			repository.delete(optional.get());
			return true;
		}
		
		return false;
	}
}
