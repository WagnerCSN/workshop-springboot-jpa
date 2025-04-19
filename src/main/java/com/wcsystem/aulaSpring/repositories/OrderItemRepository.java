package com.wcsystem.aulaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wcsystem.aulaSpring.entities.OrderItem;
import com.wcsystem.aulaSpring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
