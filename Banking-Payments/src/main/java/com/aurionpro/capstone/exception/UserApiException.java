package com.aurionpro.capstone.exception;

import org.springframework.http.HttpStatus;

public class UserApiException extends RuntimeException {

//	public UserApiException(HttpStatus badRequest, String string) {
//		// TODO Auto-generated constructor stub
//	}

	
	private static final long serialVersionUID = 1L;
	private HttpStatus status;
    private String message;

    public UserApiException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public UserApiException(String message, HttpStatus status, String message1) {
        super(message);
        this.status = status;
        this.message = message1;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
