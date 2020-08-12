package com.order.service.item.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.service.item.model.OrderItamService;
import com.order.service.item.repository.OrderItamServiceRepository;
@Service
public class OrderItamBussinessService {

	@Autowired
	private OrderItamServiceRepository repository;
	
	public OrderItamService saveOrderItam(OrderItamService orderItam) {
		return repository.save(orderItam);
	}
	
	public List<OrderItamService> getAllOrderItam() {
		return repository.findAll();
	}
}
