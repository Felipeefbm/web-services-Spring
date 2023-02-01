package com.unforgiven.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unforgiven.course.entityes.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
