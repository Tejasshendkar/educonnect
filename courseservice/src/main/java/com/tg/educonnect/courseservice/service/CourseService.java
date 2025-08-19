package com.tg.educonnect.courseservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.tg.educonnect.courseservice.entity.Course;
import com.tg.educonnect.courseservice.exception.CustomException;
import com.tg.educonnect.courseservice.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public Course getCourseById(Long id) {
		return courseRepository.findById(id)
				.orElseThrow(() -> new CustomException("Course not found of Id: " + id, HttpStatus.NOT_FOUND.value()));
	}

	public List<Course> getCourse() {
		List<Course> courseList = courseRepository.findAll();
		if (courseList.isEmpty()) {
			throw new CustomException("No courses Available Now", HttpStatus.NOT_FOUND.value());
		}
		return courseList;
	}

	public Course addNewCourse(Course courseRef) {
		Course course= courseRepository.save(courseRef);
		if(course==null) {
			throw new CustomException("unable to add course", HttpStatus.BAD_REQUEST);
		}
		return  course;
	}
}
