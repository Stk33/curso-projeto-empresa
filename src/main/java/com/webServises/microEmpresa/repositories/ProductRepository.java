package com.webServises.microEmpresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webServises.microEmpresa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
