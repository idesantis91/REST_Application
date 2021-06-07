package com.example.restservice;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CountRepository extends MongoRepository<Count, String> {

}
