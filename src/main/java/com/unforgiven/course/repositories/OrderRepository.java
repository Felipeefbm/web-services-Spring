package com.unforgiven.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unforgiven.course.entityes.Order;

public interface OrderRepository extends JpaRepository <Order,Long>{

	
}
