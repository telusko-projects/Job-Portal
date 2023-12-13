package com.telusko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.model.JobPost;
import com.telusko.repo.JobPostRepo;

@Service
public class JobPostService {

	@Autowired
	private JobPostRepo jobPostRepo;
	public List<JobPost> getAllPosts(){
		return jobPostRepo.
	}
	
}
