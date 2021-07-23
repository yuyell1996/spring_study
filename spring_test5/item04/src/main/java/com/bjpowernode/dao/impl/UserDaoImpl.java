package com.bjpowernode.dao.impl;

import com.bjpowernode.dao.UserDao;
import com.bjpowernode.user.SysUser;

public class UserDaoImpl implements UserDao {
    @Override
    public void insertUser(SysUser user) {
        System.out.println("*****正在创建*****");
        System.out.println("账户ID："+user.getUserid());
        System.out.println("账户名称："+user.getUsername());
        System.out.println("账户密码："+user.getPassword());
        System.out.println("账户邮箱："+user.getEmail());
    }
}
