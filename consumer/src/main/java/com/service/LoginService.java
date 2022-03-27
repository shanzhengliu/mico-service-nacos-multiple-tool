package com.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "login-service")
public interface LoginService {

    @RequestMapping("/user/list")
    String list();

    @RequestMapping("/user/findOne")
    String findOne();
}
