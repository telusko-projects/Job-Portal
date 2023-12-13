package com.telusko.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.exception.JobPostIdNotFoundException;
import com.telusko.model.JobPost;
import com.telusko.service.JobPostService;

@RestController
public class JobPostController {

	@Autowired
	private JobPostService jobPostService;

	
	
	
	// controller method to get all job posts
	public ResponseEntity<List<JobPost>> getAllPosts() {
		return new ResponseEntity<List<JobPost>>(jobPostService.getAllPosts(), HttpStatus.OK);

	}
	
	
	
	
	
	
	//******************************************************************
	
	
	
	//controller method to get a single job post by Id
	public ResponseEntity<JobPost> getJobPostById(@PathVariable int postId) throws JobPostIdNotFoundException{
		return new ResponseEntity<JobPost>(jobPostService.getJobPostById(postId),HttpStatus.OK);
		
	}
	
	
	
	
	//******************************************************************
	
	
	//controller method to add a job Post
	public ResponseEntity<JobPost> addAJobPost(@RequestBody JobPost post){
		return new ResponseEntity<JobPost>(jobPostService.addNewJobPost(post),HttpStatus.CREATED);
		
	}
	
	
	
	
	//******************************************************************
	
	
	//controller method to delete a job post
	public ResponseEntity<String> deleteJobPost(@PathVariable int postId) throws JobPostIdNotFoundException{
		return new ResponseEntity<String>(jobPostService.deleteJobPostById(postId),HttpStatus.OK);
		
	}
	
	
	
	
	
	//******************************************************************
	
	//controller method to update a jobPost
	public ResponseEntity<JobPost> updateJobPostById(@PathVariable int postId,@RequestBody JobPost post) throws JobPostIdNotFoundException{
		return new ResponseEntity<JobPost>(jobPostService.updateJobPost(postId, post),HttpStatus.CREATED);
	}
}
