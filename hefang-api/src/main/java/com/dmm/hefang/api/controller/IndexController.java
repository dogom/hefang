package com.dmm.hefang.api.controller;


import com.dmm.hefang.db.po.Dict;
import com.dmm.hefang.db.po.HefangPO;
import com.dmm.hefang.db.service.DictService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {

    @Autowired
    private DictService dictService;

    @GetMapping("/")
    public Dict test() {
        Dict dict = dictService.getById(1);
        return dict;
    }


}
