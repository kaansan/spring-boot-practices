package com.springbootpractice.orderservice.repository;

import com.springbootpractice.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
