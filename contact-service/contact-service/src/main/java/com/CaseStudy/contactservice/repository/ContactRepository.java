package com.CaseStudy.contactservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.CaseStudy.contactservice.model.Contact;

public interface ContactRepository extends MongoRepository<Contact, String>{

	
}
