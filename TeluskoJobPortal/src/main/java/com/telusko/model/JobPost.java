package com.telusko.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
@Document(collection = "jobportal")
public class JobPost {

	@Id
	private int postId;

	@NotEmpty(message = "Please write valid profile details for post")
	private String postProfile;
	
	@NotEmpty(message = "please porvide valid post description")
	@Size(min = 10, message = "please porvide valid post description greater than 10 characters ")
	private String postDesc;
	
	
	
	@NotNull( message = "Experience can't be greater than 2 digits")
	@Min(1)
	@Max(15)
	private Integer reqExperience;
	
	
	@NotEmpty(message = "please provide at least one tech stack")
	private String postTechStack[];

}
