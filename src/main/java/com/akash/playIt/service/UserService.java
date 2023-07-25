package com.akash.playIt.service;

import java.util.List;

import com.akash.playIt.model.User;

public interface UserService {

	
	//create User
	public User createUser(User user) throws Exception;
	
	//get person by email
	public User getUser(String email);
	
	//get person details
	public User getPersonDetails(User user);
	
	//get all Users
	public List<User> getAllUser();
	
}
