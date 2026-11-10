package com.example.identityservice.auth;

public class InvalidCredentialsException extends RuntimeException {

    public InvalidCredentialsException() {
        super("Bad credentials");
    }
}
