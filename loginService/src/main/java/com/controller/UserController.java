package com.controller;


import com.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/list")
    public String list() {
        return userRepository.findById("1").get().getUsername();
    }
}
