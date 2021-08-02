package com.bjpowernode;

import com.bjpowernode.exeception.NotEnoughException;
import com.bjpowernode.service.BuyService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void Test01() throws NotEnoughException {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        BuyService service = (BuyService) ctx.getBean("bugService");
        service.buy(1002,10);

    }
}
