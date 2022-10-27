package com.empower.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empower.hr.entity.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer>
{

}
