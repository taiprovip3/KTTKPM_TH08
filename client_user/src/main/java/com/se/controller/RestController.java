package com.se.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.se.entity.User;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
	
	@GetMapping("/user")
	public String helloWorld() {
		return "Hello this is user-server page!";
	}
	
	@GetMapping("/users")
	public List<User> getUsers() {
		User u1 = new User(1, "Nguyen Van A");
		User u2 = new User(2, "Nguyen Van B");
		List<User> users = null;
		users.add(u1);
		users.add(u2);
		return users;
	}
	
}
