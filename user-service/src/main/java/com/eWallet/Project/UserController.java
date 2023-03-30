package com.eWallet.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	// Create a User
	
	@Autowired 
	UserService userService;
	
	@PostMapping("/user")
	public User createUser(@RequestBody UserCreateRequest userCreateRequest) {
		return userService.create();
	}
	
	// Get the User Details
	
	@GetMapping("/user")
	public User getUser(@RequestParam("id") int id) {
		
		return userService.get(id);
		
	}
}
