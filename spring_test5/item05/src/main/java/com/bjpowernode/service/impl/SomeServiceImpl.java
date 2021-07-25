package com.bjpowernode.service.impl;

import com.bjpowernode.service.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doEnd(String name) {
        System.out.println("执行了业务方法doEnd");
    }

    @Override
    public void doThred() {
        System.out.println("执行了业务方法doThred");
    }

    @Override
    public String doSecond(String name, Integer age) {
        System.out.println("执行了业务方法doSecond");
        return "abcd";
    }

    @Override
    public String doFirst(String name) {
        System.out.println("执行了业务方法doFirst");
        return "abcd";
    }

    @Override
    public void doOther() {
        System.out.println("执行了业务方法doOther");
    }

    @Override
    public void doSome(String name, Integer age) {
        System.out.println("执行了业务方法doSome");
    }
}
