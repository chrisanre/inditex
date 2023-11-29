package com.example.inditex.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PRICES")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PricesEntity {

	@Column(name = "BRAND_ID")
	private Integer brandId; 
	
	@Column(name = "START_DATE")
	private LocalDateTime startDate;
	
	@Column (name = "END_DATE")
	private LocalDateTime endDate; 
	
	@Id
	@Column (name = "PRICE_LIST")
	private String rate;
	
	@Column (name = "PRODUCT_ID")
	private String productId; 
	
	@Column (name = "PRIORITY")
	private Integer priority;
	
	@Column (name = "PRICE")
	private BigDecimal price; 
	
	@Column (name = "CURR")
	private String curr; 
	
}
