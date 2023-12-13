package com.telusko.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.telusko.model.JobPost;

public interface JobPostRepo extends MongoRepository<JobPost, Integer> {

}
