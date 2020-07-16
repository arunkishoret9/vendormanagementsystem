package com.home.asssignment.services;

import java.util.List;

import com.home.asssignment.entity.JobPostingEntity;


public interface JobPostingService {

	public List<JobPostingEntity> getAllJobPosting();
	public void saveJobPosting(JobPostingEntity jobPosting);
}
