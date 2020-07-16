package com.home.asssignment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="INITIAL_SCREENING_DETAILS")

public class InitialScreeningEntity {
	
	@Id
    @SequenceGenerator(name = "id_seq", sequenceName = "item_id_seq_initial", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
	private Long id;
	
	
	@Column(name="INTERVIEW_DATE")
	private String interviewdate;
	
	@Column(name="INTERVIEW_TIME")
	private String interviewTime;
	
	@Column(name="INTERVIEW_FEEDBACK")
	private String interviewfeedback;
	
	@Column(name="INTERIVEW_OUTCOME")
	private String interviewOutcome;

	public String getInterviewdate() {
		return interviewdate;
	}

	public void setInterviewdate(String interviewdate) {
		this.interviewdate = interviewdate;
	}

	public String getInterviewTime() {
		return interviewTime;
	}

	public void setInterviewTime(String interviewTime) {
		this.interviewTime = interviewTime;
	}

	public String getInterviewfeedback() {
		return interviewfeedback;
	}

	public void setInterviewfeedback(String interviewfeedback) {
		this.interviewfeedback = interviewfeedback;
	}

	public String getInterviewOutcome() {
		return interviewOutcome;
	}

	public void setInterviewOutcome(String interviewOutcome) {
		this.interviewOutcome = interviewOutcome;
	}
	
	
	

}
