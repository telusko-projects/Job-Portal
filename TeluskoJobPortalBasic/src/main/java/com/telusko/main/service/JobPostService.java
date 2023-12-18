package com.telusko.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.telusko.main.model.JobPost;

@Service
public class JobPostService {
	
	List<JobPost> allJobPosts=new ArrayList<>();

	public List<JobPost> returnAllJobPosts(){
		
		// Creating JobPost objects in different domains
		
		//Domain Java Developer
		allJobPosts.add(new JobPost(1, "Java Developer", "must have good experience in spring boot and microservices", 5, new String[] {"Java", "J2EE","SpringBoot","Microservices"}));
		
		allJobPosts.add(new JobPost(2, "Java Developer", "must have good experience in core Java and advance Java", 0, new String[] {"Core Java", "J2EE", "Collection API","Java 8 Features"}));
	
		// Domain: Web Developer
		allJobPosts.add(new JobPost(3, "Web Developer", "experience in front-end development using React and responsive design", 3, new String[]{"HTML", "CSS", "JavaScript", "React"}));

		// Domain: Data Scientist
		allJobPosts.add(new JobPost(4, "Data Scientist", "strong background in machine learning and data analysis", 4, new String[]{"Python", "Machine Learning", "Data Analysis"}));

		// Domain: UX/UI Designer
		allJobPosts.add(new JobPost(5, "UX/UI Designer", "create engaging user experiences and intuitive user interfaces", 2, new String[]{"User Experience", "User Interface Design", "Prototyping"}));

		// Domain: Network Engineer
		allJobPosts.add(new JobPost(6, "Network Engineer", "design and implement computer networks for efficient data communication", 5, new String[]{"Networking", "Cisco", "Routing", "Switching"}));

		// Domain: Mobile App Developer
		allJobPosts.add(new JobPost(7, "Mobile App Developer", "experience in mobile app development for iOS and Android", 3, new String[]{"iOS Development", "Android Development", "Mobile App"}));

		// Domain: DevOps Engineer
		allJobPosts.add(new JobPost(8, "DevOps Engineer", "implement and manage continuous integration and delivery pipelines", 4, new String[]{"DevOps", "CI/CD", "Docker", "Kubernetes"}));

		// Domain: Graphic Designer
		allJobPosts.add(new JobPost(9, "Graphic Designer", "create visually appealing graphics and illustrations", 2, new String[]{"Graphic Design", "Adobe Creative Suite"}));

		// Domain: Database Administrator
		allJobPosts.add(new JobPost(10, "Database Administrator", "manage and optimize database systems for efficient data storage and retrieval", 5, new String[]{"Database Administration", "SQL", "Oracle", "MySQL"}));

		// Domain: CyberSecurity Analyst
		allJobPosts.add(new JobPost(11, "Cybersecurity Analyst", "protect computer systems and networks from cyber threats", 4, new String[]{"Cybersecurity", "Network Security", "Incident Response"}));

		// Domain: Business Analyst
		allJobPosts.add(new JobPost(12, "Business Analyst", "analyze business processes and requirements to recommend improvements", 3, new String[]{"Business Analysis", "Requirements Gathering", "Process Improvement"}));

		// Domain: System Administrator
		allJobPosts.add(new JobPost(13, "System Administrator", "manage and maintain computer systems and servers", 4, new String[]{"System Administration", "Linux", "Windows Server"}));

		// Domain: Full Stack Developer
		allJobPosts.add(new JobPost(14, "Full Stack Developer", "experience in both front-end and back-end development", 5, new String[]{"JavaScript", "Node.js", "React", "Express", "MongoDB"}));

		// Domain: Cloud Architect
		allJobPosts.add(new JobPost(15, "Cloud Architect", "design and implement cloud infrastructure solutions", 6, new String[]{"Cloud Computing", "AWS", "Azure", "Google Cloud"}));

		// Domain: QA Tester
		allJobPosts.add(new JobPost(16, "QA Tester", "test software applications to ensure quality and identify bugs", 2, new String[]{"Quality Assurance", "Testing", "Test Automation"}));

		// Domain: Technical Writer
		allJobPosts.add(new JobPost(17, "Technical Writer", "create documentation for software products and technical processes", 3, new String[]{"Technical Writing", "Documentation"}));

		return allJobPosts;
	}
}
