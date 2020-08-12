package com.order.service.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.service.main.model.OrderService;

public interface OrderServiceRepository extends JpaRepository<OrderService,Integer> {

}
