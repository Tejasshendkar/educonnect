package com.tg.educonnect.courseservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.tg.educonnect.courseservice.dto.UserDTO;
import com.tg.educonnect.courseservice.entity.Course;
import com.tg.educonnect.courseservice.entity.CourseEnrollment;
import com.tg.educonnect.courseservice.exception.CustomException;
import com.tg.educonnect.courseservice.feignclient.UserClient;
import com.tg.educonnect.courseservice.repository.CourseEnrollmentRepository;
import com.tg.educonnect.courseservice.repository.CourseRepository;

@Service
public class CourseEnrollmentService {

	@Autowired
	private UserClient userClient;

	@Autowired
	private CourseService courseService;

	@Autowired
	private CourseEnrollmentRepository courseEnrollmentRepository;
	
	@Autowired
	private CourseRepository courseRepository;

	public CourseEnrollment enrollCourse(CourseEnrollment courseEnroll) {
		UserDTO userDto = userClient.getUserById(courseEnroll.getUserId());
		Course course = courseService.getCourseById(courseEnroll.getCourseId());
		if( userDto==null && course==null) {
				throw new CustomException("Unable to enroll course now", HttpStatus.BAD_REQUEST);
		}
		CourseEnrollment courseEnrollment = courseEnrollmentRepository.save(courseEnroll);
		
		return courseEnrollment;
	}
	
	
	public List<Course> getAllCourseByUserId(Long userId){
		UserDTO user=userClient.getUserById(userId);
		List<CourseEnrollment> courseEnrollmentList=courseEnrollmentRepository.findByUserId(userId);
		if(!courseEnrollmentList.isEmpty()) {
			List<Long> courseIdList= courseEnrollmentList.stream().map(CourseEnrollment::getCourseId).toList();
		  return courseRepository.findAllById(courseIdList);
		}else {
			throw new CustomException("No course Enroll by you", HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	
}
