package com.gg.docker.dockerspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockerSpringBootApplication {

	public static void main(String[] args) {
		System.out.println("Hello World");
		SpringApplication.run(DockerSpringBootApplication.class, args);
	}


	@RestController
	static final class MyController {

		@GetMapping("/")
		public String greeting(){
			return "Hello World!!";
		}
	}
}
