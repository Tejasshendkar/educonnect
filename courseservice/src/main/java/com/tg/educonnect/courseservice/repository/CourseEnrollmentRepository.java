package com.tg.educonnect.courseservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tg.educonnect.courseservice.entity.CourseEnrollment;

public interface CourseEnrollmentRepository extends JpaRepository<CourseEnrollment, Long> {
	
  List<CourseEnrollment> findByUserId(Long userId);

}
