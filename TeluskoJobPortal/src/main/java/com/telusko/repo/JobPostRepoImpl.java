package com.telusko.repo;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.telusko.exception.JobPostIdNotFoundException;
import com.telusko.exception.QueryNotFoundException;
import com.telusko.model.JobPost;

import lombok.Data;

@Repository

public class JobPostRepoImpl implements JobPostRepo {

	ArrayList<JobPost> saveJobPosts = new ArrayList<>();
	
	
	
	
	//*************************************************************************************
	
	
	
	
	//to find all JobPosts in the ArrayList
	@Override
	public ArrayList<JobPost> findAll() {

		return saveJobPosts;
	}

	
	//*************************************************************************************
	
	
	
	
	//to save a job post in ArrayList 
	public JobPost save(JobPost post) {
		saveJobPosts.add(post);
		return post;
	}

	
	
	//*************************************************************************************
	
	
	
	//to find a job post by id in the ArrayList
	public JobPost findById(int postId) throws JobPostIdNotFoundException {
		for (JobPost jPost : saveJobPosts) {
			if (jPost.getPostId() == postId) {
				return jPost;

			}
		}
		throw new JobPostIdNotFoundException("Oops!  job post not found with given id.");
	}

	
	
	
	//*************************************************************************************
	
	
	
	//to delete a job post in the ArrayList
	public String deleteById(int postId) throws JobPostIdNotFoundException {

		for (JobPost jPost : saveJobPosts) {
			if (jPost.getPostId() == postId) {
				saveJobPosts.remove(jPost);
				return "job post with given id is deleted.";

			}
		}
		throw new JobPostIdNotFoundException("Oops!  job post not found with given id.");
	}

	
	
	
	
	
	//*************************************************************************************
	
	
	
	//to search a job post br string query in the ArrayList
	@Override
	public ArrayList<JobPost> searchByString(String query) throws QueryNotFoundException {
	    ArrayList<JobPost> searchedJobPosts = new ArrayList<>();

	    for (JobPost jPost : saveJobPosts) {
	        String[] keyWords = jPost.getKeyWords();
	        for (String str : keyWords) {
	            if (str.equals(query)) {
	                searchedJobPosts.add(jPost);
	                break; 
	            }
	        }
	    }

	    if (!searchedJobPosts.isEmpty()) {
	        return searchedJobPosts;
	    } 
	    else {
	        throw new QueryNotFoundException("Sorry, the query string is not matching any specific keyword in Job Posts");
	    }
	}


}
