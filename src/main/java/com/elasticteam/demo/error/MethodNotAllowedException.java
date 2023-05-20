package com.elasticteam.demo.error;

/**
 * The type method not allowed exception.
 */
public class MethodNotAllowedException extends RuntimeException {

    /**
     * Instantiates a new method not allowed exception.
     *
     * @param message the message
     */
    public MethodNotAllowedException(String message) {
        super(message);
    }

    /**
     * Instantiates a new method not allowed exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public MethodNotAllowedException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new method not allowed exception.
     *
     * @param cause the cause
     */
    public MethodNotAllowedException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new method not allowed exception.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    protected MethodNotAllowedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
