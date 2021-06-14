package com.example.restservice;

import org.springframework.data.mongodb.repository.MongoRepository;

//Creates MongoDB Template 
public interface CountRepository extends MongoRepository<Count, String> {

}
