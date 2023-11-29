package com.example.inditex.service;

import java.util.List;

import com.example.inditex.model.ProductResponseBean;

/**
 * The Interface ProductService.
 */
public interface ProductService {
	
	/**
	 * Retrieve product info list.
	 *
	 * @param date the date
	 * @param productId the product id
	 * @param brandId the brand id
	 * @return the list
	 */
	List<ProductResponseBean> retrieveProductInfoList (String date, String productId, Integer brandId); 

}
