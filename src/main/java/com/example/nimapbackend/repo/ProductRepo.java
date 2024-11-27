package com.example.nimapbackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nimapbackend.model.Products;
@Repository
public interface ProductRepo extends JpaRepository<Products, Integer>{

}
