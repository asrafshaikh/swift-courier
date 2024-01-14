package com.hometutor.spring.mongodb.dal;

import com.hometutor.spring.mongodb.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserRepository extends MongoRepository<User, String> {
}
