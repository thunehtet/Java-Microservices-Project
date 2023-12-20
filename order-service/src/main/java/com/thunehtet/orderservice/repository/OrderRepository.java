package com.thunehtet.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thunehtet.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{

    

    
}
