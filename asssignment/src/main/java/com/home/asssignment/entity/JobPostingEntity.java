package com.home.asssignment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="JOB_POSTING")
public class JobPostingEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="JOB_TITLE")
	private String jobTitle;
	
	@Column(name="JOB_DESCRIPTION")
	private String jobDescription;
	
	@Column(name="WAGE_RANGE")
	private String wageRange;
	
	public Long getId() {
		return id;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getWageRange() {
		return wageRange;
	}
	public void setWageRange(String wageRange) {
		this.wageRange = wageRange;
	}
}
