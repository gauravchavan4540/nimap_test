package com.example.nimapbackend.service;

import java.util.List;

import com.example.nimapbackend.model.Categories;
import com.example.nimapbackend.model.Products;
import com.example.nimapbackend.model.ResponseDTO;

public interface ProductService {

ResponseDTO findAllProducts(int pageNO,int pageSize);
	
Products findByProductsId(int id);
	
Products addProducts(Products prod);
	
	int deleteProducts(int id);
	
	int updateProducts(int id,Products prod);
}
