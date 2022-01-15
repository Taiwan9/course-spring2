package com.clownser.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clownser.course.entities.User;

public interface UserRepositosy extends JpaRepository<User, Long> {

}
