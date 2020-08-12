package com.order.service.item.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.order.service.item.model.OrderItemService;


public interface OrderItemServiceRepository extends JpaRepository<OrderItemService, Integer> {

}
