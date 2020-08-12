package com.feign.client.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feign.client.model.OrderService;

@RestController
@RequestMapping(value="/OrderService")
public class ConsumerOrderServiceController {
	
    @Autowired
	private OrderServiceFiegn orderFiegn;
	@PostMapping(value = "/savaservice")
	public OrderService saveOrder(@RequestBody OrderService orderService) {
          return orderFiegn.saveOrder(orderService) ;
	}//http://localhost:8524/OrderService/savaservice
	@GetMapping(value = "/fetchAll")
	public List<OrderService> getAllOrders(){
		return orderFiegn.getAllOrders();
	}
	
}
