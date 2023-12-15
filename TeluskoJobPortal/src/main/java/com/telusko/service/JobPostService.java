package com.telusko.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.exception.JobPostIdNotFoundException;
import com.telusko.model.JobPost;
import com.telusko.repo.JobPostRepoImpl;

@Service
public class JobPostService {

	
	//injecting object of JobPostRepo Interface(Proxy class:object at runtime)
	@Autowired
	private JobPostRepoImpl jobPostRepo;

	
	
	
	//*******************************************************************
	
	
	// to get all job posts
	public List<JobPost> getAllPosts() {
		return jobPostRepo.findAll();
	}
	
	
	
	
	//*******************************************************************
	
	
	
	

	// to get a single job post
	public JobPost getJobPostById(int postId) throws JobPostIdNotFoundException {
		Optional<JobPost> optional = jobPostRepo.findById(postId);
		if (optional != null) {
			return optional.get();
		} else {
			throw new JobPostIdNotFoundException("Oops! jobPost not found with given id: "+postId);
		}
	}
	
	
	
	//*******************************************************************
	
	
	
	
	
	

	// to delete a job post with given id
	public String deleteJobPostById(int postId) throws JobPostIdNotFoundException {
		Optional<JobPost> optional = jobPostRepo.findById(postId);

		if (optional != null) {
			jobPostRepo.deleteById(postId);
			return "job post deleted with given id"+postId;
		} else {
			throw new JobPostIdNotFoundException("Oops! jobPost not found with given id: "+postId);
		}
	}

	
	
	
	//*******************************************************************
	
	
	
	
	
	
	
	// to update a job post with given id
	public JobPost updateJobPost(int postId, JobPost newJobPost) throws JobPostIdNotFoundException {
		Optional<JobPost> optional = jobPostRepo.findById(postId);

		if (optional != null) {
			JobPost existingJobPost = optional.get();
			existingJobPost.setPostProfile(newJobPost.getPostProfile());
			existingJobPost.setPostTechStack(newJobPost.getPostTechStack());
			existingJobPost.setPostDesc(newJobPost.getPostDesc());
			existingJobPost.setReqExperience(newJobPost.getReqExperience());

			// saving the update values
			return jobPostRepo.save(existingJobPost);

		} else {
			throw new JobPostIdNotFoundException("Oops! jobPost not found with given id: "+postId);
		}
	}

	
	
	
	//*******************************************************************
	
	
	
	// to add a new job post
	public JobPost addNewJobPost(JobPost post) {
		return jobPostRepo.save(post);
	}
}
