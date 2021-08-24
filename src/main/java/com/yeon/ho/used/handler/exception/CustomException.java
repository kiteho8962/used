package com.yeon.ho.used.handler.exception;

public class CustomException extends RuntimeException{

    private static final Long serialVersionUID = 1L;

    public CustomException(String message) {
        super(message);
    }
}
