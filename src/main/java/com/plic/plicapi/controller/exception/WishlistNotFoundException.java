package com.plic.plicapi.controller.exception;

public class WishlistNotFoundException extends RuntimeException {
    public WishlistNotFoundException() {
        super();
    }

    public WishlistNotFoundException(String message) {
        super(message);
    }

    public WishlistNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public WishlistNotFoundException(Throwable cause) {
        super(cause);
    }

}
