package com.farmersmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmersmart.pojo.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	

}
