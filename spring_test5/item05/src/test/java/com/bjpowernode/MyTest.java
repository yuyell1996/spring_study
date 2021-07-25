package com.bjpowernode;

import com.bjpowernode.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void Test01(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SomeService ss = (SomeService) ctx.getBean("myService");
        ss.doSome("zhangsan",18);
        ss.doOther();
    }

    @Test
    public void Test02(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SomeService ss = (SomeService) ctx.getBean("myService");
        String res = ss.doFirst("张三");
        System.out.println(res);
        System.out.println(res.equals("abcd")?"后置通知修改目标方法的执行结果失败！":"后置通知修改目标方法的执行结果成功！");
    }

    @Test
    public void Test03(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SomeService ss = (SomeService) ctx.getBean("myService");
        String res = ss.doSecond("zhangsan",18);
        System.out.println(res);
    }

    @Test
    public void Test04(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SomeService ss = (SomeService) ctx.getBean("myService");
        ss.doThred();
    }

    @Test
    public void Test05(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SomeService ss = (SomeService) ctx.getBean("myService");
        ss.doEnd("s");
    }
}
