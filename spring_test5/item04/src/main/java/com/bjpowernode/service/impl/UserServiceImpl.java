package com.bjpowernode.service.impl;

import com.bjpowernode.dao.UserDao;
import com.bjpowernode.service.UserService;
import com.bjpowernode.user.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myService")
public class UserServiceImpl implements UserService {
    private UserDao dao = null;

    public UserDao getDao() {
        return dao;
    }
    @Autowired
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void addUser(SysUser user) {
        System.out.println("***开始注册账户***");
        dao.insertUser(user);
        System.out.println("***添加账户成功***");
    }
}
