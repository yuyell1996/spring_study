package com.bjpowernode.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myUser")
public class SysUser {
    @Value("${userid}")
    private String userid;
    @Value("${username}")
    private String username;
    @Value("${password}")
    private String password;
    @Value("${email}")
    private String email;

    @Override
    public String toString() {
        return "SysUser{" +
                "userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
