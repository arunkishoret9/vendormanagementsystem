package com.home.asssignment.services;

import java.util.List;
import java.util.Optional;

import com.home.asssignment.entity.CandidateResumeDetails;

public interface submitResumeService {
	public Long saveResume(CandidateResumeDetails resumeDetails);
	public Optional<CandidateResumeDetails> getResumeDetails(Long candidateId);
	public List<CandidateResumeDetails> getAllDetails(); 
}
