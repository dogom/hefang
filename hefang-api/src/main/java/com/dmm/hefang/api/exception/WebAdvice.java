package com.dmm.hefang.api.exception;


import com.dmm.hefang.core.exception.RRException;
import com.dmm.hefang.core.vo.ResultVO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;
import java.net.BindException;

@RestControllerAdvice
public class WebAdvice {

    private final Log logger = LogFactory.getLog(WebAdvice.class);

    @ExceptionHandler({RRException.class})
    public ResultVO handRRException(RRException e) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(e.getCode());
        resultVO.setMsg(e.getMsg());
        return resultVO;
    }

    @ExceptionHandler(value = BindException.class)
    public ResultVO handleBindException(BindException ex){
        logger.error(   "参数校验异常",ex);
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(-400);
        resultVO.setMsg(ex.getMessage());
        return resultVO;
    }

    /**
     * 单个参数校验
     * @param ex
     * @return
     */
    @ExceptionHandler(value = ConstraintViolationException.class)
    public ResultVO handleBindGetException(ConstraintViolationException ex){
        logger.error(   "参数校验异常",ex);
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(-400);
        resultVO.setMsg(ex.getMessage());
        return resultVO;
    }

    /** 处理验证 异常处理
     * @return
     */
    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResultVO handMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(-400);
        resultVO.setMsg(e.getMessage());
        return resultVO;
    }

}
