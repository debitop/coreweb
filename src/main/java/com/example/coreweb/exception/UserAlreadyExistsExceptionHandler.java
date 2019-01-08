package com.example.coreweb.exception;

import com.example.coreweb.config.Constans;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class UserAlreadyExistsExceptionHandler {

    @ExceptionHandler(UserAlreadyExistsException.class)
    @ResponseStatus(value = HttpStatus.CONFLICT)
    @ResponseBody
    public ExceptionResponse handleException(Exception ex){
        return ExceptionResponse.of()
                .httpStatus(HttpStatus.CONFLICT)
                .errorDescription(ex.getMessage())
                .error(Constans.USER_ALREADY_EXIST_CODE)
                .create();
    }
}
