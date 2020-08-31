package com.automatization.core.exception;

public class InitWebDriverException extends RuntimeTestException {

    public InitWebDriverException() {
    }

    public InitWebDriverException(String message) {
        super(message);
    }

    public InitWebDriverException(String message, Throwable cause) {
        super(message, cause);
    }

    public InitWebDriverException(Throwable cause) {
        super(cause);
    }

    public InitWebDriverException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
