package com.womenempowerment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.womenempowerment.model.User;
import com.womenempowerment.service.IUserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	IUserService service;
	
	@PostMapping("/add")
	public String addUser(@RequestBody User user) {
		service.registerUser(user);
		return "User added";
	}
	
}
