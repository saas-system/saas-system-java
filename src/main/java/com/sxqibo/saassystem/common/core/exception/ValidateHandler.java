package com.sxqibo.saassystem.common.core.exception;

import com.sxqibo.saassystem.common.core.domain.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ValidateHandler extends ResponseEntityExceptionHandler
{
    private static final Logger LOOGER = LoggerFactory.getLogger(ValidateHandler.class);

    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers,
                                                                  HttpStatus status,
                                                                  WebRequest request)
    {

        LOOGER.error("参数校验失败:{}", ex.getBindingResult().getFieldErrors());

        StringBuilder sb = new StringBuilder();

        for (FieldError fieldError : ex.getBindingResult().getFieldErrors()) {
            String defaultMessage = fieldError.getDefaultMessage();

            sb.append(defaultMessage);

            break;
        }

        return new ResponseEntity(BaseResponse.fail(sb.toString()), status);
    }
}
