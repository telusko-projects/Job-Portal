package com.telusko.repo;

import java.util.ArrayList;
import java.util.Optional;

import com.telusko.model.JobPost;

public interface JobPostRepo {

	public ArrayList<JobPost> findAll();
	 public  Optional<JobPost> findById(int postId);
	 public String deleteById(int postId) ;
	 public  JobPost save(JobPost post);
}
