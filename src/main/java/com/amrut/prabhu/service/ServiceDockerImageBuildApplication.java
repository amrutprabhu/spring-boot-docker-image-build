package com.amrut.prabhu.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ServiceDockerImageBuildApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDockerImageBuildApplication.class, args);
	}

	@GetMapping("/")
	public ResponseEntity get(){
		return ResponseEntity.ok("All Ok");
	}
}
