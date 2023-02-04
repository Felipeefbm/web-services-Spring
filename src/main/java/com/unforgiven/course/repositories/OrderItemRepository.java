package com.unforgiven.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unforgiven.course.entityes.OrderItem;
import com.unforgiven.course.entityes.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
