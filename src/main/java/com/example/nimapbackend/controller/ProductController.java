package com.example.nimapbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nimapbackend.model.Products;
import com.example.nimapbackend.model.ResponseDTO;
import com.example.nimapbackend.service.ProductService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	ProductService productService;
	
	//This url is used to store  product
	@PostMapping("/products")
	public Products addProds(@RequestBody Products prod)
	{
		return productService.addProducts(prod);
	}
	
	//This url is used to get All product using page Number
	@GetMapping("/products")
	public ResponseDTO findAllProds(@RequestParam(value = "pageNo", defaultValue = "1", required = false) int pageNo, @RequestParam(value = "pageSize", defaultValue = "2", required = false) int pageSize) {
		return productService.findAllProducts(pageNo,pageSize);
	} 
	
	//This url is used to get particular product
	@GetMapping("/products/{di}")
	public Products findById(@PathVariable("di") int id) 
	{
		return productService.findByProductsId(id);
	}
	
	//This url is used to delete particular id,list or product
	@DeleteMapping("/products/{di}")
	public int deleteproducts(@PathVariable("di") int id)
	{
			return productService.deleteProducts(id);	
	}
	
	//This url is used to update particular id,list or product
	@PutMapping("/products/{di}")
	public int putMethodName(@PathVariable("di") int id, @RequestBody Products prod) 
	{
		return productService.updateProducts(id, prod);
	}
	
	
	
	
	
	

}
