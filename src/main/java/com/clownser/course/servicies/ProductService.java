package com.clownser.course.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clownser.course.entities.Product;
import com.clownser.course.repositories.ProductRepositosy;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepositosy repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
