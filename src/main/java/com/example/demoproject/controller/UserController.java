package com.example.demoproject.controller;

import com.example.demoproject.entity.User;
import com.example.demoproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @GetMapping("/signin/{username}")
    public User signIn(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }
}
