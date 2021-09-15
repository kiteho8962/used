package com.yeon.ho.used.handler.exception;

public class CustomApiException extends RuntimeException {
    // 데이터를 리턴하는 컨트롤러

    private static final long serialVersionUID = 1L;

    public CustomApiException(String message) {
        super(message);
    }

}
