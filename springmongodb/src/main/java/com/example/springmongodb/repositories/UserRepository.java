package com.example.springmongodb.repositories;

import com.example.springmongodb.document.User;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

@Document
public interface UserRepository extends MongoRepository <User, Integer> {
}
