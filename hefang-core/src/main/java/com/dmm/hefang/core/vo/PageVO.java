package com.dmm.hefang.core.vo;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;

public class PageVO {


    @Min(value = 1,message = "必须大于0")
    private Integer pageNum;
    @Range(min = 1,max = 1000,message = "一次性获取最大列表数不能超过1000")
    private Integer pageSize;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
