package com.cg.fms.service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.fms.dao.IProductDao;
import com.cg.fms.dto.Product;
@Service
public class ProductServiceImpl implements ProductService

{
	@Autowired
	IProductDao pdao;
	@Override
	public Optional<Product> getProduct(String productId) {
		return pdao.findById(productId);
	}
	
	@Override
	public Product addProduct(Product product) {
		return pdao.save(product);
		
	}
	

	@Override
	public void updateProduct(Product product) {
		pdao.save(product);
	}

	@Override
	public void deleteProduct(String productId) {
		pdao.deleteById(productId);
		
	}

	@Override
	public List<Product> getAllProducts() {
		
		return pdao.findAll() ;
	}

	

}
