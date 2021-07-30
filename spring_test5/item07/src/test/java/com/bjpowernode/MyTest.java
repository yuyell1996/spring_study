package com.bjpowernode;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void Test01(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) ctx.getBean("myService");
        Student student = service.selectById(1);
        System.out.println(student);
    }
    @Test
    public void Test02(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) ctx.getBean("myService");
        List<Student> students = service.AllStudent();
        for(Student s:students){
            System.out.println(s);
        }
    }

    @Test
    public void Test03(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) ctx.getBean("myService");
        Student student = new Student();
        student.setAge(18);
        student.setEmail("asd");
        student.setId(9);
        student.setName("sad");
        int res  = service.addStudent(student);
        System.out.println(res);
    }

}
