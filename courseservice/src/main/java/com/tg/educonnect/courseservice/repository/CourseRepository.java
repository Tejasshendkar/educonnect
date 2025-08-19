package com.tg.educonnect.courseservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tg.educonnect.courseservice.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
