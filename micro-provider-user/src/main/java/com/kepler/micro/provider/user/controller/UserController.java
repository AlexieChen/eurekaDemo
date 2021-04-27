package com.kepler.micro.provider.user.controller;

import com.kepler.micro.api.User;
import com.kepler.micro.provider.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public int addUser(@RequestBody  User user){
        return userService.addUser(user);
    }

}
