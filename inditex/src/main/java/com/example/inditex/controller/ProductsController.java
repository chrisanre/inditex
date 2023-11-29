package com.example.inditex.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.inditex.model.ProductResponseBean;
import com.example.inditex.service.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductsController {
	
	private ProductService productService; 
	
	
	/**
	 * Instantiates a new products controller.
	 *
	 * @param productService the product service
	 */
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}




	@GetMapping(value = "/info", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductResponseBean> getProductInfo (@RequestParam ("date")
			String localdateTime, @RequestParam ("product_id") String productId, @RequestParam ("brand_id") Integer brandId) {
		
		return productService.retrieveProductInfoList(localdateTime, productId, brandId);
	} 
	
}
