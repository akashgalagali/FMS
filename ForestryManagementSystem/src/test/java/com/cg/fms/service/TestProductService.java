package com.cg.fms.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.fms.dto.Product;

class TestProductService {
	ProductServiceImpl productService=null;
	@BeforeEach
	public void setup() {
		productService=new ProductServiceImpl();
	}
	@AfterEach
	public void tearend() {
		productService=null;
	}
	@Test
	public void getProductTest() {
		Product p=new Product("100","wood","100","something");
		assertEquals(p,productService.getProduct("102"));
	}

}
