package com.example.springsecurityQ1;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@EnableWebSecurity
@RestController
public class Mycontroller {
	
	
	@GetMapping("/")
	public String  hello() {
		return("hello world!");
		
	}

	@GetMapping("/user")
	public String  user() {
		return("hello world user!");
		
	}


	@GetMapping("/admin")
	public String  admin() {
		return("hello world admin!");
		
	}

}
