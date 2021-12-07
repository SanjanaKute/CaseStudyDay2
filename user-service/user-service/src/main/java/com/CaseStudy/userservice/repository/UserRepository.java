package com.CaseStudy.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.CaseStudy.userservice.model.Users;

public interface UserRepository extends MongoRepository<Users, String> 
{

}
