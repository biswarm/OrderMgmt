package com.order.service.item.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.service.item.model.OrderItemService;
import com.order.service.item.repository.OrderItemServiceRepository;
@Service
public class OrderItemBussinessService {

	@Autowired
	private OrderItemServiceRepository repository;
	
	public OrderItemService saveOrderItem(OrderItemService orderItem) {
		return repository.save(orderItem);
	}
	
	public List<OrderItemService> getAllOrderItem() {
		return repository.findAll();
	}
}
