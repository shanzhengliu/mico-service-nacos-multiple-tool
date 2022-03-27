package com.service.impl;

import com.db.dto.UserDetail;
import com.db.entity.User;
import com.db.qentity.QUser;
import com.db.qentity.QUserInfo;
import com.querydsl.core.Tuple;
import com.querydsl.jpa.JPQLQuery;
import com.service.BaseService;
import com.service.UserQueryService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserQueryServiceImpl extends BaseService implements UserQueryService {
    @Override
    public User queryOneUserByUserName(String username) {
        QUser qUser = QUser.user;
        User user = queryFactory.select(qUser).from(qUser).where(qUser.username.eq(username)).fetchOne();
        return user;
    }

    @Override
    public Tuple queryOneUserInfoByUserName(String username) {
        QUser qUser = QUser.user;
        QUserInfo qUserInfo = QUserInfo.userInfo;
        Tuple query = queryFactory.select(qUser.username, qUserInfo.userSex, qUserInfo.userEmail).from(qUser).innerJoin(qUserInfo).on(qUser.id.eq(qUserInfo.userId)).where(qUser.username.eq(username)).fetchOne();
        return query;
    }

}
