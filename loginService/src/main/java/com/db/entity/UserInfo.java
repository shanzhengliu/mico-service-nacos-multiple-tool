package com.db.entity;

import javax.persistence.*;

@Entity
@Table(name = "userInfo")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "user_id")
    public Long userId;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_sex")
    private Integer userSex;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Integer getUser_sex() {
        return userSex;
    }

    public void setUserSex(Integer user_sex) {
        this.userSex = user_sex;
    }


    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
