package com.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.backend.dto.SaleSuccessDTO;
import com.backend.dto.SaleSumDTO;
import com.backend.entites.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("SELECT new com.backend.dto.SaleSumDTO(obj.seller, SUM(obj.amount) )"
			+ "from Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	
	@Query("SELECT new com.backend.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals) )"
			+ "from Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
}
