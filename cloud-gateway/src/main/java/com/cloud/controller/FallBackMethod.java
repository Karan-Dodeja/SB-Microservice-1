package com.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethod {
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod() {
		return "User Service Taking Longer Than Excpected!" + 
				"Please try Again Later";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBackMethod() {
		return "Department Service Taking Longer Than Excpected!" + 
				"Please try Again Later";
	}	
}
