package com.company.Exception;

public class NotFullPaidException extends Exception {

    public NotFullPaidException (String message, long remainingValue) {
        super(message.concat(Long.toString(remainingValue)));
    }
}
