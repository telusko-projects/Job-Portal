package com.telusko.repo;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.telusko.exception.JobPostIdNotFoundException;
import com.telusko.model.JobPost;

@Repository
public class JobPostRepoImpl implements JobPostRepo {

	ArrayList<JobPost> saveJobPosts = new ArrayList<>();


	@Override
	public ArrayList<JobPost> findAll() {

		return saveJobPosts;
	}

	public JobPost save(JobPost post) {
		saveJobPosts.add(post);
		return post;
	}

	public JobPost findById(int postId) throws JobPostIdNotFoundException {
		for (JobPost jPost : saveJobPosts) {
			if (jPost.getPostId() == postId) {
				return jPost;

			}
		}
		throw new JobPostIdNotFoundException("Oops!  job post not found with given id.");
	}

	public String deleteById(int postId) throws JobPostIdNotFoundException {

		for (JobPost jPost : saveJobPosts) {
			if (jPost.getPostId() == postId) {
				saveJobPosts.remove(jPost);
				return "job post with given id is deleted.";

			}
		}
		throw new JobPostIdNotFoundException("Oops!  job post not found with given id.");
	}

	@Override
	public ArrayList<JobPost> searchByString(String query) {
		ArrayList<JobPost> searchedJobPosts=new ArrayList<>();
		for(JobPost jPost:saveJobPosts) {
			String[] keyWords=jPost.getKeyWords();
			for(String str:keyWords) {
				if (str.equals(query)) {
					searchedJobPosts.add(jPost);
					break;
				}
			}
		}
		return searchedJobPosts;
	}

}
