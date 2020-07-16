package com.home.asssignment.model;

/*
 * This form Model is used by Admin to create Job Posting
 */
public class JobPosting {
	
	private String jobTitle;
	private String jobDescription;
	private String wageRange;
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
