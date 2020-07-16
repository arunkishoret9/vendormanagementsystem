package com.home.asssignment.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.asssignment.entity.FinalInterviewEntity;
import com.home.asssignment.repository.FinalScreeningRepository;
import com.home.asssignment.services.FinalScreeningService;

@Service
public class FinalScreeningServiceImpl implements FinalScreeningService{

	@Autowired
	private FinalScreeningRepository finalScreeningRepository;
	
	@Override
	public void saveInitialInterviewScreening(FinalInterviewEntity details) {
		finalScreeningRepository.save(details);
		
	}

	
}
