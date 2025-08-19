package com.tg.educonnect.courseservice.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "course_enrollments", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"userId", "courseId"})
})
public class CourseEnrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;  // From UserService

    private Long courseId;

    private LocalDateTime enrolledAt = LocalDateTime.now();

    
    public CourseEnrollment() {
		// TODO Auto-generated constructor stub
	}


	public CourseEnrollment(Long id, Long userId, Long courseId, LocalDateTime enrolledAt) {
		super();
		this.id = id;
		this.userId = userId;
		this.courseId = courseId;
		this.enrolledAt = enrolledAt;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public Long getCourseId() {
		return courseId;
	}


	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}


	public LocalDateTime getEnrolledAt() {
		return enrolledAt;
	}


	public void setEnrolledAt(LocalDateTime enrolledAt) {
		this.enrolledAt = enrolledAt;
	}
    
    
}
