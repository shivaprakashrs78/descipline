package com.user.details.service;



import org.springframework.stereotype.Service;

import com.user.details.model.User;

import java.util.List;

@Service
public class UserService {
    public List<User> getAllUsers() {
        return List.of(
                new User("Raju", "raghu@gmail.com", "78765489"),
                new User("Rahul", "ram@gmail.com", "98675432"),
                new User("Raj", "raj@gmail.com", "78654345")
        );
    }
}

