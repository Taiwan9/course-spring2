package com.clownser.course.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clownser.course.entities.Order;
import com.clownser.course.repositories.OrderRepositosy;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepositosy repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
