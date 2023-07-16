package com.vops.demo.controller;

import com.vops.demo.Repositories.UserRepository;
import com.vops.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {

    @Autowired
  private UserService userService;

    @PostMapping("/login")
    public boolean login(String username, String password) {
        return userService.login(username, password);
    }
}
