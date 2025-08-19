package com.tg.educonnect.courseservice.exception;


public class CustomException extends RuntimeException {

    private final String message;
    private final Object errorCode;

    public CustomException(String message, Object errorCode) {
        super(message);
        this.message = message;
        this.errorCode = errorCode;
    }

    public Object getErrorCode() {
        return errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

    

