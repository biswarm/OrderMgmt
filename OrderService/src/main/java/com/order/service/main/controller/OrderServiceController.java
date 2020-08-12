package com.order.service.main.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.service.main.model.OrderService;
import com.order.service.main.services.OrderServiceService;

@RestController
@RequestMapping(value = "/orderService")
public class OrderServiceController {
	@Autowired
	private OrderServiceService service;

	@PostMapping(value="/saveOrder")
	public OrderService saveOrder(@RequestBody OrderService orderService) {
		orderService.setOrderDate(new Date());
		return service.saveOrder(orderService);
	}//http://localhost:9090/orderService/saveOrder/
	@GetMapping(value="/fetchAllOrders")
	 public List<OrderService> getAllOrders() {
		 return service.getAllOrders();
	  }//http://localhost:9090/orderService/fetchAllOrders
}
