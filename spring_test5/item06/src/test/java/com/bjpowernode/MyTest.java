package com.bjpowernode;

import com.bjpowernode.service.NumberService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void Test01(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        NumberService service = (NumberService) ctx.getBean("myService");
        Integer res = service.addNum(1,2,3);
        System.out.println("计算结果为："+res);
    }
    @Test
    public void Test02(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        NumberService service = (NumberService) ctx.getBean("myService");
        Integer res = service.addNum(0,0,3);
        System.out.println("计算结果为："+res);
    }
    @Test
    public void Test03(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        NumberService service = (NumberService) ctx.getBean("myService");
        Integer res = service.addNum(null,1,null);
        System.out.println("计算结果为："+res);
    }
}
