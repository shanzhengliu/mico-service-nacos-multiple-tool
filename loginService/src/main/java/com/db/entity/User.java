package com.db.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;

    @Column(name = "username")
    String username;

    @Column(name = "password")
    String password;
}
