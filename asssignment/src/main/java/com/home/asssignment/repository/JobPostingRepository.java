package com.home.asssignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.home.asssignment.entity.JobPostingEntity;

public interface JobPostingRepository extends JpaRepository<JobPostingEntity, Long> {

}
