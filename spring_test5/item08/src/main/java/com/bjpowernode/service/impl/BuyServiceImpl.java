package com.bjpowernode.service.impl;

import com.bjpowernode.dao.GoodsDao;
import com.bjpowernode.dao.SaleDao;
import com.bjpowernode.entity.Goods;
import com.bjpowernode.entity.Sale;
import com.bjpowernode.exeception.NotEnoughException;
import com.bjpowernode.service.BuyService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class BuyServiceImpl implements BuyService {
    private SaleDao saleDao;
    private GoodsDao goodsDao;

    //    //第一种方式
//    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT,
//                    readOnly = false, timeout = 20,
//                    rollbackFor = {NullPointerException.class, NotEnoughException.class})
//    //第二种方式
//    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT,
//            readOnly = false, timeout = 20)
    //第三种方式
    @Transactional
    @Override
    public void buy(Integer goodsid, Integer num) {
        System.out.println("-------------------buy方法的开始-------------------");

        //生成销售记录
        Sale sale = new Sale();
        sale.setGid(goodsid);
        sale.setNum(num);
        saleDao.insertSale(sale);

        //查询商品
        Goods goods = goodsDao.selectById(goodsid);
        if(goods==null){
            throw new NullPointerException("商品不存在");
        }else if(goods.getAmount()<num){
            throw new NullPointerException("商品库存不足");
        }

        //更新库存
        Goods buygood = new Goods();
        buygood.setId(goodsid);
        buygood.setAmount(num);
        goodsDao.updateGoods(buygood);


        System.out.println("-------------------buy方法的结束-------------------");
    }

    public SaleDao getSaleDao() {
        return saleDao;
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public GoodsDao getGoodsDao() {
        return goodsDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }
}
