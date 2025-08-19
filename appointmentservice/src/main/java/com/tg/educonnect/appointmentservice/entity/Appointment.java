package com.tg.educonnect.appointmentservice.entity;

import java.time.LocalDateTime;

import com.tg.educonnect.appointmentservice.enums.AppointmentStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "appointments")
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long appointmentId;

	private Long userId; 

	private Long courseId; 

	private LocalDateTime appointmentDate;
    
	@Enumerated(EnumType.STRING)
	private AppointmentStatus status;

	private String notes;

	private LocalDateTime createdAt = LocalDateTime.now();

	public Appointment() {
		// TODO Auto-generated constructor stub
	}

	public Appointment(Long appointmentId, Long userId, Long courseId, LocalDateTime appointmentDate, AppointmentStatus status,
			String notes, LocalDateTime createdAt) {
		super();
		this.appointmentId = appointmentId;
		this.userId = userId;
		this.courseId = courseId;
		this.appointmentDate = appointmentDate;
		this.status = status;
		this.notes = notes;
		this.createdAt = createdAt;
	}

	public Long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
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

	public LocalDateTime getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDateTime appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public AppointmentStatus getStatus() {
		return status;
	}

	public void setStatus(AppointmentStatus status) {
		this.status = status;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

}