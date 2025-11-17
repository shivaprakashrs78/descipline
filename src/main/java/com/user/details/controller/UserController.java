package com.user.details.controller;



import org.springframework.web.bind.annotation.*;

import com.user.details.model.User;
import com.user.details.service.UserService;

import java.util.List;


@RestController
@RequestMapping("/api/users")
public class UserController {
	
	

    private final UserService userService;
    
    

    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/data")
    public String getData() {
        return "Welcome to SpringBoot Controller";
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }
}

