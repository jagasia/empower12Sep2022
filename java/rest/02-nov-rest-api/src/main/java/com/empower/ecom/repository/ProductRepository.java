package com.empower.ecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empower.ecom.entity.Merchant;
import com.empower.ecom.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
{
	List<Product> findByMerchant(Merchant merchant);
}
