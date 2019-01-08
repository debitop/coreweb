package com.example.coreweb.exception;

import com.example.coreweb.config.Constans;

public class UserAlreadyExistsException extends RuntimeException{

    private static final long serialVersionUID = -5364572375467234345L;

    public UserAlreadyExistsException(){
        super(Constans.USER_ALREADY_EXIST_DESCRIPTION);
    }

}
