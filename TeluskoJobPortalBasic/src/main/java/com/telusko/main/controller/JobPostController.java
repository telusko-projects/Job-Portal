package com.telusko.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.main.model.JobPost;
import com.telusko.main.service.JobPostService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:3000")
public class JobPostController {
	
	@Autowired
	private JobPostService jobPostService;

	
	
	//controller method for getting all job posts 
	@CrossOrigin
	@GetMapping("/allPosts")
	public List<JobPost> getAllJobPosts(){
		return jobPostService.returnAllJobPosts();
		
	}
	
	
	
	//************************************************************
	
	
	//controller method to get a Job Post By Id
	@CrossOrigin
	@GetMapping("/getJobPostById/{id}")
	public JobPost getJobPostById(@PathVariable int id) {
		return jobPostService.returnJobPostById(id);
	}
	
	
	
	
	//************************************************************
	
	
	
	//controller method to add a job post
	@CrossOrigin
	@PostMapping("/addJobPost")
	public JobPost addJobPost(@RequestBody JobPost jobPost) {
		return jobPostService.addJobPost(jobPost);
	}
	
	
	
	
	//************************************************************
	
	
	
	
	
	//controller method to update a job post by id
	@CrossOrigin
	@PutMapping("/updateJobPostById/{id}")
	public JobPost updateJobPost(@PathVariable int id,@RequestBody JobPost jobPost) {
		return jobPostService.updateJobPostById(id, jobPost);
	}
	
	
	
	
	
	//************************************************************
	
	
	
//controller method to save a JobPost
	@DeleteMapping("/deleteJobPostById/{id}")
	@CrossOrigin
	public String deleteJobPostById(@PathVariable int id) {
		return jobPostService.deleteJobPostById(id);
		
	}
	
}
