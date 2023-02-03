package com.unforgiven.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unforgiven.course.entityes.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
