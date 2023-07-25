package com.akash.playIt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.playIt.model.User;
import com.akash.playIt.repo.UserRepository;
import com.akash.playIt.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public User createUser(User user) throws Exception{
		User local = userRepository.findByEmail(user.getEmail());
		if(local!=null) {
			System.out.println("User is already there!!!");
			throw new Exception("User already present!!!");
		}
		else
		{
			local=this.userRepository.save(user);
		}
		return local;
	}

	@Override
	public User getUser(String email) {
		return this.userRepository.findByEmail(email);
	}

	@Override
	public List<User> getAllUser() {
		return this.userRepository.findAll();
	}

	@Override
	public User getPersonDetails(User user) {
		return userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
	}

	


	
}
