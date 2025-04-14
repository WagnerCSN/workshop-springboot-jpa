package com.wcsystem.aulaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wcsystem.aulaSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
