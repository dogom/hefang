package com.dmm.hefang.db.service;


import com.dmm.hefang.db.dao.GoodsMapper;
import com.dmm.hefang.db.po.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    public List<Goods> listGoods(){


        return null;
    }


    public Goods getById(Integer id) {
        Goods goods = goodsMapper.selectByPrimaryKey(id);
        return goods;
    }
}
