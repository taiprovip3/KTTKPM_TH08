package com.se.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.se.entity.User;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/")
public class RestController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${crmRest.userService.url}")
	private String userServiceUrl;
	
	@Value("${crmRest.departmentService.url}")
	private String departmentServiceUrl;
	
	@GetMapping("/circuit")
	public String helloWorld() {
		return "Hello this is department-server page!";
	}
	
	@GetMapping("/users")	//Lấy danh sách users
	public List<User> getUsers(){
		ResponseEntity<List<User>> responseEntity = restTemplate.exchange(
				userServiceUrl + "/users",
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<User>>() {}
		);
		List<User> users = responseEntity.getBody();
		return users;
	}
	
}
