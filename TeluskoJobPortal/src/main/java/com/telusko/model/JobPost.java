package com.telusko.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "JobPost")
public class JobPost {

	
	private int postId;
	private String postProfile;
	private String postDesc;
	private int reqExperience;
	private String postTechStack[];
	
}
