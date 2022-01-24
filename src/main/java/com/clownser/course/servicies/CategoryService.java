package com.clownser.course.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clownser.course.entities.Category;
import com.clownser.course.repositories.CategoryRepositosy;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepositosy repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
