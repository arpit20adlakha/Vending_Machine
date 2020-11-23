package com.company.Exception;

public class NotSufficientChangeException extends RuntimeException{
    String message;
    public NotSufficientChangeException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
