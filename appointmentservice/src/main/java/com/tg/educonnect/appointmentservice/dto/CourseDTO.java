package com.tg.educonnect.appointmentservice.dto;

import java.time.LocalDate;

public class CourseDTO {

	private Long courseId;

	private String title;

	private String description;

	private LocalDate startDate;

	private LocalDate endDate;

	public CourseDTO() {

	}

	public CourseDTO(Long courseId, String title, String description, LocalDate startDate, LocalDate endDate) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

}
