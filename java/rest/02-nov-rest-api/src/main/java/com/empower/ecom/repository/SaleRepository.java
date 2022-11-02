package com.empower.ecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.empower.ecom.entity.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Integer>
{
	@Query("select s from Sale s where s.customer.email=:email")
	List<Sale> findSalesByCustomerEmail(@Param("email") String email);
	
	@Query("select s from Sale s where s.product.merchant.email=:email")
	List<Sale> findSalesByMerchantEmail(@Param("email") String email);
	
	@Query("select s from Sale s where s.product.id=:id")
	List<Sale> findSalesByProductId(@Param("id")Integer id);
}
