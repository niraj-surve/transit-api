package com.transit.app.common.exception;

public class ResourceAlreadyExistsException extends RuntimeException {
    public ResourceAlreadyExistsException(String message) {
        super (message);
    }

    public ResourceAlreadyExistsException(String message, Throwable cause) {
        super (message, cause);
    }
}
