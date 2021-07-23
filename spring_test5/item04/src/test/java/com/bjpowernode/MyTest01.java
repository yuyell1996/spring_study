package com.bjpowernode;

import com.bjpowernode.service.UserService;
import com.bjpowernode.user.SysUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {
    public static void main(String[] args) {

        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SysUser user = (SysUser) ctx.getBean("myUser");
        UserService us = (UserService) ctx.getBean("myService");
        us.addUser(user);

    }
}
