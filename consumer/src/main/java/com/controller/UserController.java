package com.controller;

import com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {


    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Autowired
    LoginService loginService;

    @GetMapping("/test")
    public String test() {
        return loginService.list();
    }
}
