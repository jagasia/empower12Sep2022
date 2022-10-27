package com.empower.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empower.hr.entity.Candidate;
import com.empower.hr.service.CandidateService;

@RestController
@RequestMapping("/candidate")
public class CandidateController {
	@Autowired
	private CandidateService cs;
	
	@PostMapping
	public Candidate addCustomer(@RequestBody Candidate candidate)
	{
		return cs.create(candidate);
	}
	
	@GetMapping
	public List<Candidate> getAllCustomers()
	{
		return cs.read();
	}
	
	@GetMapping("/{id}")
	public Candidate findCustomerById(@PathVariable("id") Integer id)
	{
		return cs.read(id);
	}
	
	@PutMapping
	public Candidate updateCustomer(@RequestBody Candidate candidate)
	{
		return cs.update(candidate);
	}
	
	@DeleteMapping("/{id}")
	public Candidate deleteCustomer(@PathVariable("id") Integer id)
	{
		return cs.delete(id);
	}
}
