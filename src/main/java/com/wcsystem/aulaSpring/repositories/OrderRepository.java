package com.wcsystem.aulaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wcsystem.aulaSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
