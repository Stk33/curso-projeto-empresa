package com.webServises.microEmpresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webServises.microEmpresa.entities.OrderItem;
import com.webServises.microEmpresa.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{
	
}
