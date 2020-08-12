package com.order.service.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.service.main.model.OrderService;
import com.order.service.main.repo.OrderServiceRepository;

@Service
public class OrderServiceService {
  @Autowired
  private OrderServiceRepository repository;
  
  public OrderService saveOrder(OrderService orderService) {
	 return repository.save(orderService);
  }
  public List<OrderService> getAllOrders() {
		 return repository.findAll();
	  }
}
