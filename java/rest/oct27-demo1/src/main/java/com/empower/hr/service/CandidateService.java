package com.empower.hr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empower.hr.entity.Candidate;
import com.empower.hr.repository.CandidateRepository;

@Service
public class CandidateService {
	@Autowired
	private CandidateRepository cr;
	
	public Candidate create(Candidate candidate)
	{
		return cr.save(candidate);
	}
	public List<Candidate> read()
	{
		return cr.findAll();
	}
	public Candidate read(Integer id)
	{
		Optional<Candidate> temp = cr.findById(id);
		Candidate candidate=null;
		if(temp.isPresent())
			candidate=temp.get();
		return candidate;
	}
	public Candidate update(Candidate candidate)
	{
		Optional<Candidate> temp = cr.findById(candidate.getId());
		Candidate c=null;
		if(temp.isPresent())
		{
			cr.save(candidate);
			c=candidate;
		}
		return c;
	}
	public Candidate delete(Integer id)
	{
		Optional<Candidate> temp = cr.findById(id);
		Candidate candidate=null;
		if(temp.isPresent())
		{
			candidate=temp.get();
			cr.delete(candidate);
		}
		return candidate;
	}
}
