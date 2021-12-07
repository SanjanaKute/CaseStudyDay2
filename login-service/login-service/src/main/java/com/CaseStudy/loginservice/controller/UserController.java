package com.CaseStudy.loginservice.controller;

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

import com.CaseStudy.loginservice.model.Userdb;
import com.CaseStudy.loginservice.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	
	  @PostMapping("/addUser") 
	  public String saveUser(@RequestBody Userdb userdb) 
	  {
		  	repository.save(userdb); 
		  	return "Added user with id :" +userdb.getUserId(); 
	  }
	 
	  @GetMapping("/findAllUsers")
	  public List<Userdb> getAllUsers()
	  {
		    return repository.findAll();
	  }
	  
	  @GetMapping("/findAllUsers/{userId}")
	  public Optional<Userdb> getUser(@PathVariable int userId)
	  {
		  	return repository.findById(userId);
	  }
	
	  @DeleteMapping("/delete/{userId}")
	  public String deleteUser(@PathVariable int userId)
	  {
		repository.deleteById(userId);
		return "User deleted with id "+userId;	
	  }

}
