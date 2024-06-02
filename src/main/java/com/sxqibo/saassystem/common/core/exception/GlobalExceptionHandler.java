package com.sxqibo.saassystem.common.core.exception;

import com.sxqibo.saassystem.common.core.domain.BaseResponse;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler(BaseException.class)
    @ResponseBody
    public BaseResponse baseExceptionHandler(BaseException e)
    {
        return BaseResponse.fail(e.getMessage());
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseBody
    public BaseResponse methodArugmentNotValidExceptionHandler(MethodArgumentNotValidException e)
    {
        StringBuilder sb = new StringBuilder();

        List<ObjectError> allError = e.getBindingResult().getAllErrors();
        String message = allError.stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.joining(";"));

        return BaseResponse.fail(400, message);
    }

    /**
     * 业务异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(CustomException.class)
    public BaseResponse businessException(CustomException e)
    {
        return BaseResponse.fail(e.getCode(), e.getMsg(), e.isSuccess());
    }
}
