package com.clownser.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clownser.course.entities.OrderItem;

public interface OrderItemRepositosy extends JpaRepository<OrderItem, Long> {

}
