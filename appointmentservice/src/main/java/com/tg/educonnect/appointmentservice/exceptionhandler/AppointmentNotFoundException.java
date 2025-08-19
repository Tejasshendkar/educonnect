package com.tg.educonnect.appointmentservice.exceptionhandler;

public class AppointmentNotFoundException extends RuntimeException{

	String massage;
	
	public AppointmentNotFoundException() {
      
	}

	public AppointmentNotFoundException(String massage) {
		super(massage);
	}
	
	
}
