package com.elasticteam.demo.error;

/**
 * The type Entity not found exception.
 */
public class BadRequestException extends RuntimeException {

    /**
     * Instantiates a bad request exception.
     *
     * @param message the message
     */
    public BadRequestException(String message) {
        super(message);
    }

    /**
     * Instantiates a bad request exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public BadRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a bad request exception.
     *
     * @param cause the cause
     */
    public BadRequestException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a bad request exception.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    protected BadRequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
