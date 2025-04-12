package com.wcsystem.aulaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wcsystem.aulaSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
