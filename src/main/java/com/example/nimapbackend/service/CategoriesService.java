package com.example.nimapbackend.service;

import java.util.List;
import java.util.Optional;

import com.example.nimapbackend.model.Categories;

public interface CategoriesService {

	List<Categories> findAllCategories();
	
	Categories findByCategoryId(int id);
	
	Categories addCategory(Categories cat);
	
	int deleteCategory(int id);
	
	int updateCategory(int id,Categories cat);
}
