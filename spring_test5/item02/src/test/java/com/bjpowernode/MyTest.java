package com.bjpowernode;

import com.bjpowernode.stu.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void Test01(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ctx.getBean("myStudent");
        System.out.println(student);
    }
}
