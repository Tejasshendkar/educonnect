package com.tg.educonnect.appointmentservice.exceptionhandler;

public class CustomException extends RuntimeException {

	String msg;

	public CustomException(String msg) {
		super(msg);
	}
}
