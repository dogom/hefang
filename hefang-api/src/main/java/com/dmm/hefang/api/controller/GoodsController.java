package com.dmm.hefang.api.controller;


import com.dmm.hefang.core.exception.RRException;
import com.dmm.hefang.core.vo.ResultVO;
import com.dmm.hefang.db.po.Goods;
import com.dmm.hefang.db.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
