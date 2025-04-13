package com.wcsystem.aulaSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcsystem.aulaSpring.entities.Category;
import com.wcsystem.aulaSpring.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	
	public Category findById(Long id) {
		Optional<Category> obj= repository.findById(id);
		return obj.get();
	}
}
