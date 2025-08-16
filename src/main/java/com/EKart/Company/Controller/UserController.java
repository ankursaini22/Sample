package com.EKart.Company.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EKart.Company.Entities.User;
import com.EKart.Company.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@GetMapping
	public List<User> getAllUsers(){
		return userservice.fetchAllUser();
	}
}
