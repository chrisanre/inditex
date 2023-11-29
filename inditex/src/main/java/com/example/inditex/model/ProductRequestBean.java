package com.example.inditex.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * The Class ProductRequestBean.
 */
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequestBean {

	/** The effective date. */
	private String effectiveDate; 
	
	/** The product id. */
	private String productId; 
	
	/** The brand id. */
	private Integer brandId;
	
}
