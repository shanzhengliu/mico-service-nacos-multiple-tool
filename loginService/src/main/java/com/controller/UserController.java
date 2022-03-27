package com.controller;


import com.db.qentity.QUser;
import com.db.qentity.QUserInfo;
import com.db.repository.UserRepository;
import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.service.UserQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RefreshScope
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserQueryService userQueryService;


    @GetMapping("/list")
    public String list() {
        return userRepository.findById("1").get().getUsername();
    }


    @GetMapping("/findOne")
    public String findOne() {
        return userQueryService.queryOneUserByUserName("sam").getPassword();
    }

    @GetMapping("/join")
    public String findOneInfo() {
        return userQueryService.queryOneUserInfoByUserName("sam").get(QUserInfo.userInfo.userEmail);
    }
}
