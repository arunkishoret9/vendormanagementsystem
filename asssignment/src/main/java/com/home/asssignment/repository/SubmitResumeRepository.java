package com.home.asssignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.home.asssignment.entity.CandidateResumeDetails;

public interface SubmitResumeRepository extends JpaRepository<CandidateResumeDetails, Long> {


	@Query(value = "SELECT nextval('item_id_seq')", nativeQuery =
            true)
    Long getNextSeriesId();
}
