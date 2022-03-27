package com.service;

import com.db.entity.User;

public interface UserQueryService {

    public User queryOneUserByUserName(String username);
}
