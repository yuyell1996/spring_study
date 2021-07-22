package com.bjpowernode;

import com.bjpowernode.service.SomeService;
import com.bjpowernode.service.impl.OtherService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {
    @Test
    public void Test01(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SomeService someService = (SomeService) ctx.getBean("someService");
        someService.doSome();

        int count = ctx.getBeanDefinitionCount();
        System.out.println("容器中共创建了"+count+"个对象");

        String names[] = ctx.getBeanDefinitionNames();
        for(String name:names){
            System.out.println("对象名称："+name);
        }
    }

    @Test
    public void Test02(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        Date date = (Date) ctx.getBean("myDate");
        System.out.println(date);
    }

    @Test
    public void Test03(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        OtherService otherService = (OtherService) ctx.getBean("otherService");
        otherService.doOther();
    }
}
