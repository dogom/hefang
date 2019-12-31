package com.dmm.hefang.api.exception;


import com.dmm.hefang.core.exception.RRException;
import com.dmm.hefang.core.vo.ResultVO;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class WebAdvice {

    @ExceptionHandler({RRException.class})
    public ResultVO handRRException(RRException e) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(e.getCode());
        resultVO.setMsg(e.getMsg());
        return resultVO;
    }
}
