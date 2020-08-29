package com.spring.security.oauth2.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@SpringBootApplication
@RestController
public class SpringOauth2AuthenticationApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringOauth2AuthenticationApplication.class, args);
	}

	@GetMapping("/")
	public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
		return Collections.singletonMap("No of private repos", principal.getAttribute("total_private_repos"));
	}
}
