package com.akash.playIt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.playIt.model.LoginDetails;
import com.akash.playIt.model.User;
import com.akash.playIt.service.UserService;

@RestController
@RequestMapping("/playIt/api/v1/user")
@CrossOrigin("http://localhost:4200")
public class UserController {

	@Autowired
	private UserService userService;

	// create user
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
		return this.userService.createUser(user);
	}

	// get all user
	@GetMapping("/")
	public List<User> getAllUser() {
		return this.userService.getAllUser();
	}

	
	@PostMapping("/login")
	public User getUser(@RequestBody User user) {
		User local = this.userService.getPersonDetails(user);
		if(local==null) {
			return null;
		}
		else
			return local;
	}

}
