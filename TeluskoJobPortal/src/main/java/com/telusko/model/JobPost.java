package com.telusko.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Document(collection = "jobpost")
public class JobPost {

	//@Id
	private int postId;

	@NotEmpty(message = "Please write valid profile details for post")
	private String postProfile;
	
	@NotEmpty(message = "please porvide valid post description")
	@Size(min = 10, message = "please porvide valid post description greater than 10 characters ")
	private String postDesc;
	
	
	
	@NotNull( message = "minimum experience for this role is 1 years and maximum ")
	@Min(1)
	@Max(15)
	private Integer reqExperience;
	
	
	@NotEmpty(message = "please provide at least one tech stack")
	private String postTechStack[];

}
