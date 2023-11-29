package com.example.inditex.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class ProductResponseBean {

	private String productId;
	
	private Integer brandId; 
	
	private String rate;
	
	private LocalDateTime startEffectiveDate; 
	
	private LocalDateTime endEffectiveDate; 
	
	private BigDecimal price; 
	
	private String currency; 
	
}
