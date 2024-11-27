package com.example.nimapbackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nimapbackend.model.Categories;

@Repository
public interface categoriesRepo extends JpaRepository<Categories, Integer> {

}
