package com.akash.playIt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.playIt.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
	
	User findByEmailAndPassword(String email,String password);
	
}
