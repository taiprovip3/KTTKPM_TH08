package com.se.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping("/department")
	public String helloWorld() {
		return "Hello this is department-server page!";
	}
	
}
