package com.home.asssignment.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.asssignment.entity.InitialScreeningEntity;
import com.home.asssignment.repository.InitialScreeningRepository;
import com.home.asssignment.services.InitialScreeningService;

@Service
public class InitialScreeningServiceImpl implements InitialScreeningService{

	@Autowired
	private InitialScreeningRepository initialScreeningRepository;
 
	
	@Override
	public void saveInitialInterviewScreening(InitialScreeningEntity details) {
		initialScreeningRepository.save(details);
		
	}

}
