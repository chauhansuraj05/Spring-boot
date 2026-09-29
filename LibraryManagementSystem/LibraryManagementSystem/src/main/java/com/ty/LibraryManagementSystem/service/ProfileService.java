package com.ty.LibraryManagementSystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.LibraryManagementSystem.dao.ProfileDao;
import com.ty.LibraryManagementSystem.dto.Profile;

@Service
public class ProfileService {

	@Autowired
	ProfileDao dao;
	
	public Profile createProfile(Profile profile)
	{
		return dao.saveProfile(profile);
	}
	
	public Profile viewProfile(int id)
	{
		Optional<Profile> optional = dao.viewProfile(id);
		
		if(optional.isPresent())
		{
			return optional.get();
		}
		
		return null;
	}
	
	public Profile updateProfile(int id, Profile profile)
	{
		return dao.updateProfile(id, profile);
	}
	
	public boolean deleteProfile(int id)
	{
		return dao.deleteProfile(id);
	}
}
