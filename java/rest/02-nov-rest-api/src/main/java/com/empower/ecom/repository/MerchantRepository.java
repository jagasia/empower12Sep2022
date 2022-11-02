package com.empower.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empower.ecom.entity.Merchant;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant, String>
{

}
