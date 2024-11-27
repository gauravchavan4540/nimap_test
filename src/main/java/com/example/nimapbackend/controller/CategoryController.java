package com.example.nimapbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nimapbackend.model.Categories;
import com.example.nimapbackend.service.CategoriesService;

@RestController
@RequestMapping("/api")
public class CategoryController {

	@Autowired
	CategoriesService categoriesService;
	
	//This url used to store categories
	@PostMapping("/categories")
	public Categories saveCategory(@RequestBody Categories cat)
	{
			return categoriesService.addCategory(cat);
			
	}
	
	//This url is used to get all categories
	@GetMapping("/categories")
	public List<Categories> findAllCategories()
	{
		return categoriesService.findAllCategories();
	}
	
	// This is used to get particular categories
	@GetMapping("/categories/{di}")
	public Categories findCategoryById(@PathVariable("di") int id)
	{
		return categoriesService.findByCategoryId(id);
	}
	
	//This url is used to delete particular id,list or categories
	@DeleteMapping("/categories/{di}")
	public int deleteById(@PathVariable("di") Integer id)
	{
		return categoriesService.deleteCategory(id);
	}
	
	//This url is used to update particular id,list or categories
	@PutMapping("/categories/{di}")
	public int updateCategories(@PathVariable("di") int id,@RequestBody Categories cat)
	{
		return categoriesService.updateCategory(id, cat);
		
	}
}
