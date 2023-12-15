package com.telusko.repo;

import java.util.ArrayList;

import com.telusko.exception.JobPostIdNotFoundException;
import com.telusko.exception.QueryNotFoundException;
import com.telusko.model.JobPost;

public interface JobPostRepo {

	public ArrayList<JobPost> findAll();
	 public  JobPost findById(int postId) throws JobPostIdNotFoundException;
	 public String deleteById(int postId) throws JobPostIdNotFoundException ;
	 public  JobPost save(JobPost post);
	 public ArrayList<JobPost> searchByString(String query) throws QueryNotFoundException;
}
