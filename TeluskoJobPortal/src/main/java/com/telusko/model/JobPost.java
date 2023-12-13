package com.telusko.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobPost {

	
	private int postId;
	private String postProfile;
	private String postDesc;
	private int reqExperience;
	private String postTechStack[];
	
}
