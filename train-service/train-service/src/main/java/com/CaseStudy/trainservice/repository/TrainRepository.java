package com.CaseStudy.trainservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.CaseStudy.trainservice.model.Trains;

public interface TrainRepository extends MongoRepository<Trains, String> {

}
