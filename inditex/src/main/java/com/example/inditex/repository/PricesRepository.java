package com.example.inditex.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.inditex.entity.PricesEntity;

@Repository
public interface PricesRepository extends JpaRepository<PricesEntity, String> {

	/**
	 * Retrieve products info list.
	 *
	 * @param date the date
	 * @param productId the product id
	 * @param brandId the brand id
	 * @return the list
	 */
	@Query(value = "select p from PricesEntity p where :date between p.startDate and p.endDate and p.productId =:productId and p.brandId=:brandId")
	public List<PricesEntity> retrieveProductsInfoList (@Param("date") LocalDateTime date, @Param("productId") String productId, @Param("brandId") Integer brandId); 
	
}
