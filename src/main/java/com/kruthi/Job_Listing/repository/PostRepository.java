package com.kruthi.Job_Listing.repository;

import com.kruthi.Job_Listing.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {

}
