package com.tg.educonnect.courseservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tg.educonnect.courseservice.entity.Course;
import com.tg.educonnect.courseservice.entity.CourseEnrollment;
import com.tg.educonnect.courseservice.service.CourseEnrollmentService;

@RestController
@RequestMapping("/course/enrollment")
public class CourseEnrollmentController {

	
	@Autowired
	private CourseEnrollmentService courseEnrollmentService;
	
	@PostMapping
	public ResponseEntity<CourseEnrollment> enrollCourse(@RequestBody CourseEnrollment courseEnroll){
		return new ResponseEntity<CourseEnrollment>(courseEnrollmentService.enrollCourse(courseEnroll),HttpStatus.CREATED);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<List<Course>> getAllCourseByUserId(@PathVariable Long userId) {
		return new ResponseEntity<List<Course>>(courseEnrollmentService.getAllCourseByUserId(userId),HttpStatus.OK);
	}
	
}
