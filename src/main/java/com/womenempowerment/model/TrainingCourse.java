package com.womenempowerment.model;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainingcourse")
public class TrainingCourse {
	@Id
	@Column(name="course_id", length = 4)
	private Integer trainingCourseId;
	@Column(name="course_name", length = 20)
	private String	courseName;
	@Column(name="duration", length = 10)
	private String courseDuration;
	@Column(name="starting_date")
	private LocalDate	startingDate;
	@Column(name="ending_date")
	private LocalDate	endingDate;
	@Column(name="completion_status", length = 10)
	private String	courseCompletionStatus;
	
	//Getters and setters
	public Integer getTrainingCourseId() {
		return trainingCourseId;
	}
	public void setTrainingCourseId(Integer trainingCourseId) {
		this.trainingCourseId = trainingCourseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	public LocalDate getStartingDate() {
		return startingDate;
	}
	public void setStartingDate(LocalDate startingDate) {
		this.startingDate = startingDate;
	}
	public LocalDate getEndingDate() {
		return endingDate;
	}
	public void setEndingDate(LocalDate endingDate) {
		this.endingDate = endingDate;
	}
	public String getCourseCompletionStatus() {
		return courseCompletionStatus;
	}
	public void setCourseCompletionStatus(String courseCompletionStatus) {
		this.courseCompletionStatus = courseCompletionStatus;
	}
}
