package com.example.inditex.controller;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.inditex.model.ProductResponseBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ProductsControllerTest {

	
	@Autowired
	private ProductsController productsController;
	
	@Test
	void test1() {
		
		List<ProductResponseBean> responseT1 = productsController.getProductInfo("2020-06-14 10.00.00", "35455", 1); 
	
		assertNotNull(responseT1);
		assertFalse(responseT1.isEmpty());
	}
	
	@Test
	void test2() {
		
		List<ProductResponseBean> responseT2 = productsController.getProductInfo("2020-06-14 16.00.00", "35455", 1); 
	
		assertNotNull(responseT2);
		assertFalse(responseT2.isEmpty());
	}
	
	@Test
	void test3() {
		
		List<ProductResponseBean> responseT3 = productsController.getProductInfo("2020-06-14 21.00.00", "35455", 1); 
	
		assertNotNull(responseT3);
		assertFalse(responseT3.isEmpty());
	}
	
	
	@Test
	void test4() {
		
		List<ProductResponseBean> responseT4 = productsController.getProductInfo("2020-06-15 10.00.00", "35455", 1); 
	
		assertNotNull(responseT4);
		assertFalse(responseT4.isEmpty());
	}
	
	
	@Test
	void test5() {
		
		List<ProductResponseBean> responseT5 = productsController.getProductInfo("2020-06-16 21.00.00", "35455", 1); 
	
		assertNotNull(responseT5);
		assertFalse(responseT5.isEmpty());
	}
	
}
