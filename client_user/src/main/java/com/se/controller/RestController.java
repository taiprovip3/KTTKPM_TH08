package com.se.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping("/user")
	public String helloWorld() {
		return "Hello this is user-server page!";
	}
	
}
