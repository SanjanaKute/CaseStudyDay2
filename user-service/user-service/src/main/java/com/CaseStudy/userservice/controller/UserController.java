package com.CaseStudy.userservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CaseStudy.userservice.model.Users;
import com.CaseStudy.userservice.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController
{
	@Autowired
	private UserRepository userRepository;
	

	@RequestMapping("/user")
	public String hello()
	{
		return "Hello from user service";
	}
	@PostMapping("/addUser") 
	  public String saveUser(@RequestBody Users user) 
	  {
		userRepository.save(user); 
		return "Added user with id :" +user.getUserId(); 
	  }
	 
	  @GetMapping("/findAllUsers")
	  public List<Users> getAllUsers()
	  {
		    return userRepository.findAll();
	  }

	  @GetMapping("/findAllUsers/{userId}")
	  public Optional<Users> getUser(@PathVariable String userId)
	  {
		  	return userRepository.findById(userId);
	  }
	
	  @DeleteMapping("/delete/{userId}")
	  public String deleteUser(@PathVariable String userId)
	  {
		  userRepository.deleteById(userId);
		return "User deleted with id "+userId;	
	  }
}
