package com.jr.project.dto;

/**
 *
 * @author user
 */
public class Login {

    private String message;

    public Login(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("HelloWorldBean [message=%s]", message);
    }
}
