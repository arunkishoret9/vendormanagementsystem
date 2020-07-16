package com.home.asssignment.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.home.asssignment.entity.CandidateResumeDetails;
import com.home.asssignment.entity.FinalInterviewEntity;
import com.home.asssignment.entity.InitialScreeningEntity;
import com.home.asssignment.services.FinalScreeningService;
import com.home.asssignment.services.InitialScreeningService;
import com.home.asssignment.services.submitResumeService;
import com.home.asssignment.utility.EmailTrigger;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class submitResumeController {
	
	@Autowired
	private submitResumeService submitResumeService;
	

	@Autowired
	private InitialScreeningService initialScreeningService;
	
	@Autowired
	private FinalScreeningService finalScreeningService;
	
	@Value("${hiringManager.emailAddress}")
	private String HiringEmailAddress;

	
	@Autowired
	private EmailTrigger emailTrigger;

	public void setJobPostingService(submitResumeService submitResumeService) {
		this.submitResumeService = submitResumeService;
	}
	
	
	public void setInitialScreeningService(InitialScreeningService initialScreeningService) {
		this.initialScreeningService = initialScreeningService;
	}


	public void setFinalScreeningService(FinalScreeningService finalScreeningService) {
		this.finalScreeningService = finalScreeningService;
	}



	@GetMapping("/api/getcandidatedetails")
	public Optional<CandidateResumeDetails> getCandidateResumeDetails(@RequestParam("candidateId") Long candidateId) {
		return submitResumeService.getResumeDetails(candidateId);
	}
	
	
	@GetMapping("/api/getallcandidatedetails")
	public List<CandidateResumeDetails> getAllCandidateResumeDetails() {
		return submitResumeService.getAllDetails();
	}
	
	
	@PostMapping("/api/submitresume")
	public void submitCandidateResume(@RequestBody CandidateResumeDetails resumeDetails) {
		Long candidateId = submitResumeService.saveResume(resumeDetails);
		try {
			String subject = "New Resume Submitted " + resumeDetails.getVendorname();
			String body = "Hi Manager , <br/> We have recently recieved resume from Vendor. </br>"
					+ "<h3>Candidate Name is " + resumeDetails.getCandidatename() + " applied for Job " + 
					resumeDetails.getJobapplyingfor() + " with experience in years " + resumeDetails.getExperienceyrs()
					+ ".Click the follwing <a href='http://localhost:4200/resumeacceptreject/" + (candidateId-1) +"'>link</a> to accept or reject</h3>";
			String fromEmail = resumeDetails.getVendoremail();
			String toEmail = HiringEmailAddress;
			emailTrigger.sendmail(subject , body , fromEmail, toEmail);
		} catch(Exception e) {
			
		}
	
	}
	
	@PostMapping("/api/rejectresume")
	public void rejectCandidateResume(@RequestBody CandidateResumeDetails resumeDetails) {
		submitResumeService.saveResume(resumeDetails);
		try {
			String subject = "Rejected Resume from the following Vendor " + resumeDetails.getVendorname();
			String body = "Hi Vendor , <br/> We have recently recieved resume.</br>"
					+ "<h3>Candidate Name is " + resumeDetails.getCandidatename() + " applied for Job and is not suitable for this job" + 
					resumeDetails.getJobapplyingfor();
			String fromEmail = HiringEmailAddress;
			String toEmail = resumeDetails.getVendoremail();
			emailTrigger.sendmail(subject , body , fromEmail, toEmail);
		} catch(Exception e) {
			
		}
	
	}
	
	@PostMapping("/api/acceptresume")
	public void acceptCandidateResume(@RequestBody CandidateResumeDetails resumeDetails) {
		submitResumeService.saveResume(resumeDetails);
		try {
			String subject = "Accepted Resume from the following Vendor" + resumeDetails.getVendorname();
			String body = "Hi Vendor , <br/> We have recently recieved resume. </br>"
					+ "<h3>Candidate Name is " + resumeDetails.getCandidatename() + " applied for Job and want to schedule interview for same." + 
					resumeDetails.getJobapplyingfor();
			String fromEmail = HiringEmailAddress;
			String toEmail = resumeDetails.getVendoremail();
			emailTrigger.sendmail(subject , body , fromEmail, toEmail);
		} catch(Exception e) {
			
		}
	
	}
	
	@PostMapping("/api/initialInterviewScreening")
	public void initialInterviewScreening(@RequestBody InitialScreeningEntity resumeDetails) {
		initialScreeningService.saveInitialInterviewScreening(resumeDetails);
	}
	
	@PostMapping("/api/finalInterviewScreening")
	public void initialInterviewScreening(@RequestBody FinalInterviewEntity resumeDetails) {
		finalScreeningService.saveInitialInterviewScreening(resumeDetails);
	}
	
	
	

}
