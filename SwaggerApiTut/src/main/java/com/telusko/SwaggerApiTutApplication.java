package com.telusko;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
		info =@Info(
				
				title = "Book Open Api",
				version="1.0.0",
				description = "Book Open Api Documnetation"
				
				),
		servers = @Server(
				url = "http://localhost:8080",
				description = "Book Open Api Documentation"
				)
		
		)
public class SwaggerApiTutApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApiTutApplication.class, args);
	}

}
