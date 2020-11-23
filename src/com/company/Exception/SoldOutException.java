package com.company.Exception;

public class SoldOutException extends RuntimeException {
    String message;
    public SoldOutException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
