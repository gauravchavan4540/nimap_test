package com.example.nimapbackend.serviceimpl;

import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nimapbackend.model.Categories;
import com.example.nimapbackend.model.Products;
import com.example.nimapbackend.repo.categoriesRepo;
import com.example.nimapbackend.service.CategoriesService;
@Service
public class CategoriesServiceImpl implements CategoriesService {

	@Autowired
	categoriesRepo categoriesRepo;

	@Override
	public List<Categories> findAllCategories() {
		// TODO Auto-generated method stub
		return categoriesRepo.findAll();
	}

	@Override
	public Categories findByCategoryId(int id) {
		// TODO Auto-generated method stub
		return categoriesRepo.findById(id).get();
	}

	@Override
	public Categories addCategory(Categories cat) {
		// TODO Auto-generated method stub
	
		
		
		return categoriesRepo.save(cat);
	}

	@Override
	public int deleteCategory(int id) {
		// TODO Auto-generated method stub
		Categories c = categoriesRepo.findById(id).get();
		if(c!=null)
		{
		categoriesRepo.deleteById(id);
		return 0;
		}
		return 1;
	}

	

	@Override
	public int updateCategory(int id, Categories cat) {
		// TODO Auto-generated method stub
		Categories c = categoriesRepo.findById(id).get();
		if(c !=null)
		{
			c.setCatname(cat.getCatname());
			c.setProducts(cat.getProducts());
			categoriesRepo.save(c);
			return 0;
		}
		return 1;
	}
	
	
}
