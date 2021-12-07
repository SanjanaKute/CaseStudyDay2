package com.CaseStudy.loginservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CaseStudy.loginservice.model.Userdb;
import com.CaseStudy.loginservice.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public Userdb addUserdb (Userdb userdb)
	{
		return repository.save(userdb);
	}
	
	public List<Userdb> getUserdb() {
		List<Userdb> userdb = repository.findAll();
		System.out.println("Getting data from DB : " + userdb);
		return userdb;
	}
	
	public Optional<Userdb> getUserbyId(Integer userId) {
		return repository.findById(userId);
	}

	public void deleteContact(Userdb userdb) {
		repository.delete(userdb);
	}
}
