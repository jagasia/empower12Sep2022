package com.empower.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empower.ecom.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>
{

}
