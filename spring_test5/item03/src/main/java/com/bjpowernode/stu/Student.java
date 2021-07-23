package com.bjpowernode.stu;

import com.bjpowernode.sch.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("myStudent")
public class Student {

    private String name;

    private int age;
    //@Autowired默认是ByType方式
//    @Autowired
//    //@Autowired结合@Qualifier可以使用ByName方式，但一定要写对名称
//    @Qualifier("mySchool")
    @Resource
    private School school;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public String getName() {
        return name;
    }
    @Value("${studentname}")
    public void setName(String name) {
        System.out.println("使用Student类的setName方法，传入参数："+name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    @Value("${age}")
    public void setAge(int age) {
        System.out.println("使用Student类的setAge方法，传入参数："+age);
        this.age = age;
    }
}
