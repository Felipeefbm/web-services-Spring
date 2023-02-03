package com.unforgiven.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unforgiven.course.entityes.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
