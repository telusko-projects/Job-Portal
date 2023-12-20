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
	
	
	
	

	// ****************************************************************************

	
	
	
	
	
	// method to get a JobPost by id
	public JobPost returnJobPostById(int id) {

		return jobPostRepo.returnJobPostById(id);
	}

	
	
	
	
	// ****************************************************************************

	
	
	
	
	// method to delete a job post by id
	public String deleteJobPostById(int id) {
        return jobPostRepo.deleteJobPostById(id);
	}
	
	
	
	

	// ****************************************************************************

	
	
	
	
	// method to update a job post by id
	public JobPost updateJobPostById(int id,JobPost updatedJobPost) {

		return jobPostRepo.updateJobPostById(id, updatedJobPost);

	}
	
	
	
	
	

	// ****************************************************************************

	
	
	
	
	// method to add a jobPost
	public JobPost addJobPost(JobPost jobPost) {
		return jobPostRepo.addJobPost(jobPost);
	
	}

}
