package com.home.asssignment.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.asssignment.entity.CandidateResumeDetails;
import com.home.asssignment.entity.InitialScreeningEntity;
import com.home.asssignment.repository.SubmitResumeRepository;
import com.home.asssignment.services.submitResumeService;

@Service
public class SubmitResumeServiceImpl implements submitResumeService{

	@Autowired
	private SubmitResumeRepository submitResumeRepository;
	
	public void setSubmitResumeRepository(SubmitResumeRepository submitResumeRepository) {
		this.submitResumeRepository = submitResumeRepository;
	}
	
	@Override
	public Long saveResume(CandidateResumeDetails resumeDetails) {
		submitResumeRepository.save(resumeDetails);
		return submitResumeRepository.getNextSeriesId();
	}

	@Override
	public Optional<CandidateResumeDetails> getResumeDetails(Long candidateId) {
		return submitResumeRepository.findById(candidateId);
	
	}

	@Override
	public List<CandidateResumeDetails> getAllDetails() {
		return submitResumeRepository.findAll();
	}

	
}
