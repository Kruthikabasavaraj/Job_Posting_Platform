package com.kruthi.Job_Listing.repository;

import com.kruthi.Job_Listing.model.Post;

import java.util.List;


public interface SearchRepository {
    List<Post> findByText(String text);
}
