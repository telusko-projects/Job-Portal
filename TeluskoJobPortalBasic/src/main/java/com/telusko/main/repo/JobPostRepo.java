package com.telusko.main.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.telusko.main.model.JobPost;

@Repository
public class JobPostRepo {

     //arrayList to store store JobPost objects
	 List<JobPost> allJobPosts = new ArrayList<>();
	 
		
 
	 
	 
	 
	 //****************************************************************************	 
	
	 
	 
	 
	 
	 
	 //constructor->injecting objects into ArrayList defined above.
	 public JobPostRepo(){
		
		// Java Developer Job Post
	        allJobPosts.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
	                List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));

	        // Frontend Developer Job Post
	        allJobPosts.add(new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
	                List.of("HTML", "CSS", "JavaScript", "React")));

	        // Data Scientist Job Post
	        allJobPosts.add(new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
	                List.of("Python", "Machine Learning", "Data Analysis")));

	        // Network Engineer Job Post
	        allJobPosts.add(new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
	                List.of("Networking", "Cisco", "Routing", "Switching")));

	        // Mobile App Developer Job Post
	        allJobPosts.add(new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
	                List.of("iOS Development", "Android Development", "Mobile App")));

	        // DevOps Engineer Job Post
	        allJobPosts.add(new JobPost(6, "DevOps Engineer", "Implement and manage continuous integration and delivery pipelines", 4,
	                List.of("DevOps", "CI/CD", "Docker", "Kubernetes")));

	        // UI/UX Designer Job Post
	        allJobPosts.add(new JobPost(7, "UI/UX Designer", "Create engaging user experiences and intuitive user interfaces", 2,
	                List.of("User Experience", "User Interface Design", "Prototyping")));

	        // Cybersecurity Analyst Job Post
	        allJobPosts.add(new JobPost(8, "Cybersecurity Analyst", "Protect computer systems and networks from cyber threats", 4,
	                List.of("Cybersecurity", "Network Security", "Incident Response")));

	        // Full Stack Developer Job Post
	        allJobPosts.add(new JobPost(9, "Full Stack Developer", "Experience in both front-end and back-end development", 5,
	                List.of("JavaScript", "Node.js", "React", "Spring", "MongoDB")));

	        // Cloud Architect Job Post
	        allJobPosts.add(new JobPost(10, "Cloud Architect", "Design and implement cloud infrastructure solutions", 6,
	                List.of("Cloud Computing", "AWS", "Azure", "Google Cloud")));

	 }
	 
	 
	 
	 
	 
		
		//****************************************************************************
	 
	 
	 
	 
	 //method to return all JobPosts
	 public List<JobPost> returnAllJobPosts(){
		 return allJobPosts;
	 }

		
	
	 
	 
	 //****************************************************************************	 
	 
	
	 
	 
	 
	 //method to return JobPost by id
	 public JobPost returnJobPostById(int id) {
		 for(JobPost jPost:allJobPosts) {
			 if (jPost.getPostId()==id) {
				return jPost;
			}
		 }
		 return null;
	 }

	 
		
		//**************************************************************************** 
	 
	
	 
	 
	 
	 
	 
	 
	 
	 // method to delete a job post by id
		public String deleteJobPostById(int id) {

			for (JobPost jobPost : allJobPosts) {
				if (jobPost.getPostId() == id) {
					allJobPosts.remove(allJobPosts.indexOf(jobPost));

					return "job post with id: " + jobPost.getPostId() + " deleted ";
				}

			}
			return "job post not found with given id"+ allJobPosts.get(0).getPostId();

		}
		
		
		
		//****************************************************************************	
		
		
		
		
		
		
		
		//method to update JobPost by id
		public JobPost updateJobPostById(int id,JobPost updatedJobPost) {
		
			JobPost existingJobPost=null;
			 for(JobPost jPost:allJobPosts) 
			 {
				
				 if (jPost.getPostId()==id) 
				 {
					existingJobPost= jPost;
				}
			 
			existingJobPost.setPostProfile(updatedJobPost.getPostProfile());
			existingJobPost.setPostDesc(updatedJobPost.getPostDesc());
			existingJobPost.setPostTechStack(updatedJobPost.getPostTechStack());
			existingJobPost.setReqExperience(updatedJobPost.getReqExperience());

			return existingJobPost;

		}
			return null;
		
		}

		
		
		
		//****************************************************************************
		
		
		
		//method to return JobPost by Id
		public JobPost addJobPost(JobPost jobPost) {
			allJobPosts.add(jobPost);
			return jobPost;
		}}