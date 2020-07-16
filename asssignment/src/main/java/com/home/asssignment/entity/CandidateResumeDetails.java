package com.home.asssignment.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CANDIDATE_RESUME_DETAILS")

public class CandidateResumeDetails {
	
	@Id
    @SequenceGenerator(name = "id_seq", sequenceName = "item_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
	private Long id;
	
	@Column(name="VENDOR_COMPANY")
	private String vendorcompany;
	
	@Column(name="VENDOR_NAME")
	private String vendorname;
	
	@Column(name="VENDOR_EMAIL")
	private String vendoremail;
	
	@Column(name="CANDIDATE_NAME")
	private String candidatename;
	
	@Column(name="EXP_IN_YEARS")
	private String experienceyrs;
	
	@Column(name="JOB_APPLY_FOR")
	private String jobapplyingfor;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "initial_screening_id", referencedColumnName = "id")
	private InitialScreeningEntity initialScreening;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "final_screening_id", referencedColumnName = "id")
	private FinalInterviewEntity finalScreening;
	
	
	public Long getId() {
		return id;
	}
	
	public String getVendorcompany() {
		return vendorcompany;
	}
	public void setVendorcompany(String vendorcompany) {
		this.vendorcompany = vendorcompany;
	}
	public String getVendorname() {
		return vendorname;
	}
	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}
	public String getVendoremail() {
		return vendoremail;
	}
	public void setVendoremail(String vendoremail) {
		this.vendoremail = vendoremail;
	}
	public String getCandidatename() {
		return candidatename;
	}
	public void setCandidatename(String candidatename) {
		this.candidatename = candidatename;
	}
	public String getExperienceyrs() {
		return experienceyrs;
	}
	public void setExperienceyrs(String experienceyrs) {
		this.experienceyrs = experienceyrs;
	}
	public String getJobapplyingfor() {
		return jobapplyingfor;
	}
	public void setJobapplyingfor(String jobapplyingfor) {
		this.jobapplyingfor = jobapplyingfor;
	}

	public InitialScreeningEntity getInitialScreening() {
		return initialScreening;
	}

	public void setInitialScreening(InitialScreeningEntity initialScreening) {
		this.initialScreening = initialScreening;
	}

	public FinalInterviewEntity getFinalScreening() {
		return finalScreening;
	}

	public void setFinalScreening(FinalInterviewEntity finalScreening) {
		this.finalScreening = finalScreening;
	}
	
	

}
