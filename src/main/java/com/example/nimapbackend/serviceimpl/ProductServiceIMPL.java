package com.example.nimapbackend.serviceimpl;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.nimapbackend.model.Categories;
import com.example.nimapbackend.model.Products;
import com.example.nimapbackend.model.ResponseDTO;
import com.example.nimapbackend.repo.ProductRepo;
import com.example.nimapbackend.repo.categoriesRepo;
import com.example.nimapbackend.service.ProductService;
@Service
public class ProductServiceIMPL implements ProductService {
	@Autowired 
	ProductRepo productRepo;
	
	@Autowired
	categoriesRepo categoriesRepo;

	@Override
	public ResponseDTO findAllProducts(int pageNo,int pageSize) {
		// TODO Auto-generated method stub
		
		org.springframework.data.domain.Pageable p = PageRequest.of(pageNo, pageSize);
		Page<Products> page = productRepo.findAll(p);
		
		List<Products> content = page.getContent();
		
		long totalElements = page.getTotalElements();
		int totalPages = page.getTotalPages();
		boolean isLast = page.isLast();
		
		ResponseDTO dto = new ResponseDTO();
		
		dto.setElements(totalElements);
		dto.setProducts(content);
		dto.setLast(isLast);
		dto.setPages(totalPages);
		return  dto;
	}

	@Override
	public Products findByProductsId(int id) {
		// TODO Auto-generated method stub
		return productRepo.findById(id).get();
	}

	@Override
	public Products addProducts(Products prod) {
		// TODO Auto-generated method stub
		Categories categories = prod.getCategories();
		System.out.println(categories.getId());
		if((Integer)categories.getId() == null)
		{
			categories = categoriesRepo.save(categories);
		}
		prod.setCategories(categories);
		return productRepo.save(prod);
	}

	@Override
	public int deleteProducts(int id) {
		// TODO Auto-generated method stub
		Products p = productRepo.findById(id).get();
		if(p!=null)
		{
		productRepo.deleteById(id);
		return 0;
		}
		return 1;
	}

	@Override
	public int updateProducts(int id, Products prod) {
		// TODO Auto-generated method stub
		
		Products p = productRepo.findById(id).get();
		if(p!=null)
		{
			p.setProname(prod.getProname());
			p.setCategories(prod.getCategories());
			productRepo.save(p);
			return 0;
		}
		return 1;
	}


	

}
