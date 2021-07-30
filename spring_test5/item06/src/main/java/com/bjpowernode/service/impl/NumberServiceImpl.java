package com.bjpowernode.service.impl;

import com.bjpowernode.service.NumberService;

public class NumberServiceImpl implements NumberService {
    @Override
    public Integer addNum(Integer n1, Integer n2, Integer n3) {
        return n1+n2+n3;
    }
}
