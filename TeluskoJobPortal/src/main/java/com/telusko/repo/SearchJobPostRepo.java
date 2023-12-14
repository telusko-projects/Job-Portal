package com.telusko.repo;

import java.util.List;

import com.telusko.model.JobPost;


public interface SearchJobPostRepo {
 List<JobPost> searchJobPostsByText(String query);

}
