package com.clownser.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clownser.course.entities.Category;

public interface CategoryRepositosy extends JpaRepository<Category, Long> {

}
