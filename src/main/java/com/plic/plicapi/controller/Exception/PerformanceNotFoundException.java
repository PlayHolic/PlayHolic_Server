package com.plic.plicapi.controller.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "NotFound Error")
public class PerformanceNotFoundException extends RuntimeException {
    public PerformanceNotFoundException() { super(); }
    public PerformanceNotFoundException(String message) { super(message); }
    public PerformanceNotFoundException(String message, Throwable cause) { super(message, cause); }
    public PerformanceNotFoundException(Throwable cause) { super(cause); }
}
