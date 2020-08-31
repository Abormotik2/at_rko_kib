package com.automatization.core.exception;

public class RuntimeTestException extends RuntimeException {
    public RuntimeTestException() {
    }

    public RuntimeTestException(String message) {
        super(message);
    }

    public RuntimeTestException(String message, Throwable cause) {
        super(message, cause);
    }

    public RuntimeTestException(Throwable cause) {
        super(cause);
    }

    public RuntimeTestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
