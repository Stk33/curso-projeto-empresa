package com.webServises.microEmpresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webServises.microEmpresa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
