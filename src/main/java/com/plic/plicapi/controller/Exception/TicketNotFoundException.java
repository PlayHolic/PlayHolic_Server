package com.plic.plicapi.controller.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "NotFound Error")
public class TicketNotFoundException extends RuntimeException {
    public TicketNotFoundException() { super(); }
    public TicketNotFoundException(String message) { super(message); }
    public TicketNotFoundException(String message, Throwable cause) { super(message, cause); }
    public TicketNotFoundException(Throwable cause) { super(cause); }
}
