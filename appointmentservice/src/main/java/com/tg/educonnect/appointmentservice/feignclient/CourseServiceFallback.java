package com.tg.educonnect.appointmentservice.feignclient;

import org.springframework.stereotype.Component;

import com.tg.educonnect.appointmentservice.dto.CourseDTO;


@Component
public class CourseServiceFallback implements CourseClient {

	@Override
	public CourseDTO getCourseById(Long courseId) {
		return new CourseDTO(null,"unable to get data now try later", null, null, null);	
	}
}
