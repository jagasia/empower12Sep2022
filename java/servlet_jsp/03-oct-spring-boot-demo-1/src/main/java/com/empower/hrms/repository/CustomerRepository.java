package com.empower.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empower.hrms.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>
{

}
