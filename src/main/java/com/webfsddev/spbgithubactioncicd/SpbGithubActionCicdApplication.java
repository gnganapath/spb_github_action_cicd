package com.webfsddev.spbgithubactioncicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpbGithubActionCicdApplication {

	@GetMapping("/api/spb/github_action")
	public String Welcome(){
		return "SPB rest api servieing from Githuc actioonsn CICD";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpbGithubActionCicdApplication.class, args);
	}

}
