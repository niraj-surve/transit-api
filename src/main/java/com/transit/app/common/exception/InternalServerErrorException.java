package com.transit.app.common.exception;

public class InternalServerErrorException extends RuntimeException{
    public InternalServerErrorException(String message) {
        super (message);
    }

    public InternalServerErrorException(String message, Throwable cause) {
        super (message, cause);
    }
}
