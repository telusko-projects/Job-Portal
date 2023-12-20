package com.telusko.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.main.model.JobPost;
import com.telusko.main.repo.JobPostRepo;

@Service
public class JobPostService {
	
	@Autowired
	public JobPostRepo jobPostRepo;
	
	
	
	//method to return all JobPosts
	public List<JobPost> returnAllJobPosts() {
		return jobPostRepo.returnAllJobPosts();

		
	}
	

}
