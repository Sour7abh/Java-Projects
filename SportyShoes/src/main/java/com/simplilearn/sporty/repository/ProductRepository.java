package com.simplilearn.sporty.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.sporty.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	public Product findByProductName(String name);
	public Product findByDate(String date);
	public Product findByCategory(String category);

}
