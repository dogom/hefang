package com.dmm.hefang.api.controller;


import com.dmm.hefang.core.exception.RRException;
import com.dmm.hefang.core.vo.PageVO;
import com.dmm.hefang.core.vo.ResultVO;
import com.dmm.hefang.db.po.Goods;
import com.dmm.hefang.db.service.GoodsService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.ImmutableMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

     @GetMapping("/index")
     public ResultVO detail(Integer id){
         ResultVO resultVO = new ResultVO();
         Goods data = goodsService.getById(id);
         resultVO.setData(data);
         return resultVO;
     }

    @GetMapping("/pageList")
    public ResultVO pageList(@Valid PageVO vo){
        ResultVO resultVO = new ResultVO();
        List<Goods> goodsList = goodsService.pageList(vo);
        PageInfo<Goods> data = PageInfo.of(goodsList);
        ImmutableMap<String, Object> resMap = ImmutableMap.of("list", data, "total", data.getTotal());
        resultVO.setData(resMap);
        return resultVO;
    }


}
