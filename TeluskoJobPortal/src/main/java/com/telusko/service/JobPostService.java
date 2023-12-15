package com.telusko.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.exception.JobPostIdNotFoundException;
import com.telusko.model.JobPost;
import com.telusko.repo.JobPostRepoImpl;

@Service
public class JobPostService {

	// injecting object of JobPostRepo Interface(Proxy class:object at runtime)
	@Autowired
	private JobPostRepoImpl jobPostRepo;

	// *******************************************************************

	// to get all job posts
	public List<JobPost> getAllPosts() {
		return jobPostRepo.findAll();
	}

	// *****************************************

	public ArrayList<JobPost> searchedKeywordJobPosts(String query) {
		return jobPostRepo.searchByString(query);
	}

	// *******************************************************************

	// to get a single job post
	public JobPost getJobPostById(int postId) throws JobPostIdNotFoundException {
		JobPost jPost = jobPostRepo.findById(postId);
		if (jPost != null) {
			return jPost;
		} else {
			throw new JobPostIdNotFoundException("Oops! jobPost not found with given id: " + postId);
		}
	}

	// *******************************************************************

	// to delete a job post with given id
	public String deleteJobPostById(int postId) throws JobPostIdNotFoundException {
		JobPost jPost = jobPostRepo.findById(postId);

		if (jPost != null) {
			jobPostRepo.deleteById(postId);
			return "job post deleted with given id" + postId;
		} else {
			throw new JobPostIdNotFoundException("Oops! jobPost not found with given id: " + postId);
		}
	}

	// *******************************************************************

	// to update a job post with given id
	public JobPost updateJobPost(int postId, JobPost newJobPost) throws JobPostIdNotFoundException {
		JobPost existingJobPost = jobPostRepo.findById(postId);

		if (existingJobPost != null) {

			existingJobPost.setPostProfile(newJobPost.getPostProfile());
			existingJobPost.setPostTechStack(newJobPost.getPostTechStack());
			existingJobPost.setPostDesc(newJobPost.getPostDesc());
			existingJobPost.setReqExperience(newJobPost.getReqExperience());

			// saving the update values
			return jobPostRepo.save(existingJobPost);
		}

		else {
			throw new JobPostIdNotFoundException("Oops! jobPost not found with given id: " + postId);
		}
	}

	// *******************************************************************

	// to add a new job post
	public JobPost addNewJobPost(JobPost post) {
		return jobPostRepo.save(post);
	}
}
