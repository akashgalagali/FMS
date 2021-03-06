package com.cg.fms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fms.Exceptions.NoDataFoundException;

import com.cg.fms.dto.Product;
import com.cg.fms.service.ProductServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductServiceImpl productService;
	
	public ProductServiceImpl getProductDAO()
	{
		return productService;
	}
	public void setProductDAO(ProductServiceImpl productService)
	{
		this.productService=productService;
		
	}
	@GetMapping(value="/all",produces="application/json")
	public  ResponseEntity<List<Product>> getProducts()
	{   
		return new ResponseEntity<List<Product>> (productService.getAllProducts(),HttpStatus.OK);
	}
	
	@GetMapping(value="/{productId}",produces="application/json")
	public ResponseEntity<Optional<Product>> getProduct(@PathVariable("productId")String productId)
	{ 	Optional<Product> p=productService.getProduct(productId);
		if(p.isPresent()) {
			return new ResponseEntity<Optional<Product>>(p,HttpStatus.OK);
		}
		else 
			throw new NoDataFoundException("No Product data found with given Product ID: "+ productId);
    	
	}

	
	@PostMapping(consumes="application/json")
	public ResponseEntity<HttpStatus> addProduct(@RequestBody Product product)
	{
		productService.updateProduct(product);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		
	}
	
	@PutMapping(consumes="application/json")
	public ResponseEntity<HttpStatus> modifyProduct(@RequestBody Product product)
	{
		productService.updateProduct(product);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);	
	}
	
	@DeleteMapping(value="/{productId}")
	public ResponseEntity<HttpStatus> deleteProduct(@PathVariable("productId")String productId)
	{
		Optional<Product> p=productService.getProduct(productId);
		if(p.isPresent()) {
			productService.deleteProduct(productId);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		else 
			throw new NoDataFoundException("No Product data found with given Product ID: "+ productId);

	}
	
}
