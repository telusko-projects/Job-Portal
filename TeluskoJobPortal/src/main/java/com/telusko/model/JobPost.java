package com.telusko.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "jobportal")
public class JobPost {

	@Id
	private int postId;

	@NotEmpty(message = "Please write valid profile details for post")
	private String postProfile;
	
	@NotEmpty(message = "please porvide valid post description")
	@Size(min = 10, message = "please porvide valid post description greater than 10 characters ")
	private String postDesc;
	
	
	@NotEmpty
	@Size(min = 1, max = 2, message = "Experience can't be greater than 2 digits")
	private int reqExperience;
	
	
	@NotEmpty(message = "please provide at least one tech stack")
	private String postTechStack[];

}
