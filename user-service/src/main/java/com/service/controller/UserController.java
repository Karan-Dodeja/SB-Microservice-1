package com.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.entity.Users;
import com.service.service.UserService;
import com.service.valueobjects.ResponseTemplateVo;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public Users saveUser(@RequestBody Users users) {
		return userService.saveUser(users);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVo getUserWithDepartmentDetails(@PathVariable("id") Long userId) {
		return userService.getUserWithDepartment(userId);
	}
}
