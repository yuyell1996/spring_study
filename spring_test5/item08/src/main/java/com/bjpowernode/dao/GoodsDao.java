package com.bjpowernode.dao;

import com.bjpowernode.entity.Goods;

public interface GoodsDao {
    int updateGoods(Goods goods);
    Goods selectById(Integer id);
}
