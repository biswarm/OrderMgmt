package com.feign.client.orderservice.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.feign.client.model.OrderService;

@FeignClient(name ="ORDER-SERVICE")
public interface OrderServiceFiegn {
	@PostMapping(value = "/orderService/saveOrder")
	public OrderService saveOrder(OrderService orderService);

	@GetMapping(value = "/orderService/fetchAllOrders")
	public List<OrderService> getAllOrders();
		
	
}
