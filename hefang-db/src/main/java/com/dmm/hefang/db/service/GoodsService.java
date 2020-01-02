package com.dmm.hefang.db.service;


import com.dmm.hefang.core.vo.PageVO;
import com.dmm.hefang.db.dao.GoodsMapper;
import com.dmm.hefang.db.po.Goods;
import com.dmm.hefang.db.po.GoodsExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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

    public List<Goods> pageList(PageVO vo) {
        GoodsExample example = new GoodsExample();
        example.or().andIsDeleteEqualTo(0).andStatusEqualTo(0);
        PageHelper.startPage(vo.getPageNum(),vo.getPageSize());
        return goodsMapper.selectByExample(example);
    }


    public List<Goods> getByCategoryId(Integer categoryId) {
        GoodsExample example = new GoodsExample();
        example.or().andIsDeleteEqualTo(0).andStatusEqualTo(0).andCategoryIdEqualTo(categoryId);
        return goodsMapper.selectByExample(example);
    }
}
