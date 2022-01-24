package com.clownser.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clownser.course.entities.Order;

public interface OrderRepositosy extends JpaRepository<Order, Long> {

}
