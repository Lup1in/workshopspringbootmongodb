package com.gabriel.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gabriel.workshopmongo.domains.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
