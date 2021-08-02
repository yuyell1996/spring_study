package com.bjpowernode.service;

import com.bjpowernode.exeception.NotEnoughException;

public interface BuyService {
    void buy(Integer goodsid, Integer num) throws NotEnoughException;
}
