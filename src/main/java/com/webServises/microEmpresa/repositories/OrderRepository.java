package com.webServises.microEmpresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webServises.microEmpresa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
