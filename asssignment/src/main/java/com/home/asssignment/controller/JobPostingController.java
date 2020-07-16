package com.home.asssignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.asssignment.entity.JobPostingEntity;
import com.home.asssignment.services.JobPostingService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class JobPostingController {
	
	@Autowired
	private JobPostingService jobPostingService;

	public void setJobPostingService(JobPostingService jobPostingService) {
		this.jobPostingService = jobPostingService;
	}
	
	@GetMapping("/api/jobpostings")
	public List<JobPostingEntity> getAllJobPosting() {
		List<JobPostingEntity> jobposting = jobPostingService.getAllJobPosting();
		return jobposting;
	}
	
	@PostMapping("/api/jobpostings")
	public void saveJobPosting(@RequestBody JobPostingEntity jobPosting) {
		jobPostingService.saveJobPosting(jobPosting);
	}
	
	
	

}
