package com.example.demo.controller;



import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserRepo userRepo;

    @GetMapping("/getalluser")
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @PostMapping("/register")
    public User createUser(@RequestBody User user) {
        return userRepo.save(user);
    }
}
