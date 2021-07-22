package com.bjpowernode.stu;

import com.bjpowernode.sch.School;

public class Student {
    private String name;
    private int age;
    private School school;

    public Student() {
        System.out.println("调用了Student类的无参数构造");
    }

    public Student(String myname, int myage, School myschool) {
        System.out.println("调用了Student类的有参数构造");
        this.name = myname;
        this.age = myage;
        this.school = myschool;
    }

    @Override
    public String toString() {
        return "Student{" +
                "学生姓名：'" + name + '\'' +
                ", 学生年龄：" + age +
                ", 该生学校信息：" + school +
                '}';
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
