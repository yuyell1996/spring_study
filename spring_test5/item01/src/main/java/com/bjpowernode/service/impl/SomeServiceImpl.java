package com.bjpowernode.service.impl;

import com.bjpowernode.service.SomeService;

public class SomeServiceImpl implements SomeService {
    public SomeServiceImpl() {
        System.out.println("调用了SomeServiceImpl类的无参数构造方法");
    }

    @Override
    public void doSome() {
        System.out.println("实现了SomeService接口中的doSome方法");
    }
}
