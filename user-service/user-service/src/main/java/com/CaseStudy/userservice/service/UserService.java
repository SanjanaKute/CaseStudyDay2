package com.CaseStudy.userservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CaseStudy.userservice.model.Users;
import com.CaseStudy.userservice.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public Users addUserdb (Users user)
	{
		return userRepository.save(user);
	}
	
	public List<Users> getUserdb() {
		List<Users> user = userRepository.findAll();
		System.out.println("Getting data from DB : " + user);
		return user;
	}
	
	public Optional<Users> getUserbyId(String userId) {
		return userRepository.findById(userId);
	}

	public void deleteContact(Users user) {
		userRepository.delete(user);
	}

}
