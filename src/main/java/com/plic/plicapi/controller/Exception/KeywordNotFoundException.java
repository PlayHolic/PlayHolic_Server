package com.plic.plicapi.controller.Exception;

public class KeywordNotFoundException extends RuntimeException {
    public KeywordNotFoundException() { super(); }
    public KeywordNotFoundException(String message) { super(message); }
    public KeywordNotFoundException(String message, Throwable cause) { super(message, cause); }
    public KeywordNotFoundException(Throwable cause) { super(cause); }
}
