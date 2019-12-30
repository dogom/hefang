package com.dmm.hefang.db.service;

import com.dmm.hefang.db.dao.DictMapper;
import com.dmm.hefang.db.po.Dict;
import com.dmm.hefang.db.po.DictExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DictService {

    @Resource
    private DictMapper dictMapper;

    public Dict getByTitle(String title){
        DictExample example = new DictExample();
        example.or().andTitleEqualTo(title);
        return dictMapper.selectOneByExample(example);
    }

    public Dict getById(Integer id){
        return dictMapper.selectByPrimaryKey(id);
    }



}
