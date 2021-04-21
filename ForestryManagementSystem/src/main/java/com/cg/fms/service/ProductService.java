package com.cg.fms.service;

import java.util.List;
import java.util.Optional;

import com.cg.fms.dto.Product;

public interface ProductService {
	public Optional<Product> getProduct(String productId);

	public Product addProduct(Product product);

	public void updateProduct(Product product);

	public void deleteProduct(String productId);
	
	public List<Product> getAllProducts();
}
