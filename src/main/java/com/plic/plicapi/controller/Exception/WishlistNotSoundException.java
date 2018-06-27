package com.plic.plicapi.controller.Exception;

public class WishlistNotSoundException extends RuntimeException{
    public WishlistNotSoundException() { super(); }
    public WishlistNotSoundException(String message) { super(message); }
    public WishlistNotSoundException(String message, Throwable cause) { super(message, cause); }
    public WishlistNotSoundException(Throwable cause) { super(cause); }

}
