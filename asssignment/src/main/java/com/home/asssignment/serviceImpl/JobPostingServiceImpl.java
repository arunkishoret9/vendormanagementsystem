package com.home.asssignment.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.asssignment.entity.JobPostingEntity;
import com.home.asssignment.repository.JobPostingRepository;
import com.home.asssignment.services.JobPostingService;

@Service
public class JobPostingServiceImpl implements JobPostingService{
	
	@Autowired
	private JobPostingRepository jobPostingRepository;

	@Override
	public List<JobPostingEntity> getAllJobPosting() {
		// TODO Auto-generated method stub
		return jobPostingRepository.findAll();
	}

	@Override
	public void saveJobPosting(JobPostingEntity jobPosting) {
		jobPostingRepository.save(jobPosting);
		
	}

}
