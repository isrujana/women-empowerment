package com.womenempowerment.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class FeedBack {
	@SequenceGenerator(name="feedbacknoseq", sequenceName="feedback_seq", allocationSize=2)
	@Id
	@GeneratedValue(generator="feedbacknoseq")
	private int feedBackId;
	@Column(name="schemeRating",length=2)
	private int schemeRating;
	@Column(name="schemeTrainingRating",length=2)
	private int schemeTrainingRating;
	@Column(name="overallRating",length=2)
	private int overallRating;
	@Column(name="comments",length=20)
	private String comments;
	@Column(name="feedbackdate")
	private	LocalDate feedbackdate;
	
	//@ManyToOne
	//@JoinColumn(name="loginId")
	private User user;
	
	//@ManyToOne
	//@JoinColumn(name="trainingCourseId")
	private TrainingCourse training;
	
	//@ManyToOne
	//@JoinColumn(name="schemeId")
	private Scheme scheme;
}
