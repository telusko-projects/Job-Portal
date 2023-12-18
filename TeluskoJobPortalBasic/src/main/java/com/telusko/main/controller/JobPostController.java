package com.telusko.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.main.model.JobPost;
import com.telusko.main.service.JobPostService;

@RestController
@RequestMapping("/jPost")
public class JobPostController {
	
	@Autowired
	private JobPostService jobPostService;

	
	//controller method for getting all job posts 
	@GetMapping("/getAllJobPosts")
	public List<JobPost> getAllJobPosts(){
		return jobPostService.returnAllJobPosts();
		
	}
}
