package com.service;

import com.db.entity.User;
import com.querydsl.core.Tuple;

public interface UserQueryService {

    public User queryOneUserByUserName(String username);

    public Tuple queryOneUserInfoByUserName(String username);
}
