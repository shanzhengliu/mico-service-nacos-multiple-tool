package com.service.impl;

import com.db.entity.User;
import com.db.qentity.QUser;
import com.service.BaseService;
import com.service.UserQueryService;
import org.springframework.stereotype.Service;

@Service
public class UserQueryServiceImpl extends BaseService implements UserQueryService {
    @Override
    public User queryOneUserByUserName(String username) {
        QUser qUser = QUser.user;
        User user = queryFactory.select(qUser).from(qUser).where(qUser.username.eq(username)).fetchOne();
        return user;
    }
}
