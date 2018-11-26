package com.nadya;

public class HobbyException extends Exception{
    public HobbyException(String message) {
        super(message);
    }

    public HobbyException(String message, Throwable cause) {
        super(message, cause);
    }

    public HobbyException(Throwable cause) {
        super(cause);
    }
}
