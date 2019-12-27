package com.dmm.hefang.api.controller;


import com.dmm.hefang.db.po.HefangPO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public HefangPO test() {
        HefangPO hefangPO = new HefangPO();
        hefangPO.setId(1);
        hefangPO.setTitle("dmm");

        return hefangPO;
    }


}
