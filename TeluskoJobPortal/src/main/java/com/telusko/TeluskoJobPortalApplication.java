package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(title = "JOB PORTAL", version = "1.0.0", description = "JOB PORTAL OPEN API DOCUMENTATION"), servers = @Server(url = "http://localhost:8080", description = "This job portal can be reached through this url."))
@SpringBootApplication
public class TeluskoJobPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeluskoJobPortalApplication.class, args);
	}

}
