package com.example.spring.springq3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.entitty.Zip;
import com.example.spring.userservice.userservice;

@RestController
public class mycontroller {
     @Autowired
	private userservice us;
	@GetMapping("/")
	public void hello() {
		System.out.println("Details of zipcodes");
	}
	
	@GetMapping
	public Zip getZip(@PathVariable String zip) {
		return this.us.getZip(Long.parseLong(zip));
		
	}
	
}
