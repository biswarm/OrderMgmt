package com.order.service.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.service.item.model.OrderItamService;
import com.order.service.item.service.OrderItamBussinessService;

@RestController
@RequestMapping(value="/orderItamService")
public class OrderItamServiceController {

	@Autowired
    private OrderItamBussinessService service;
	
	@PostMapping(value="/saveItam")
	public OrderItamService saveOrderItam(@RequestBody OrderItamService orderItam) {
		return service.saveOrderItam(orderItam);
	}
	@GetMapping(value="/getAllItams")
	public List<OrderItamService> getAllOrderItam() {
		return service.getAllOrderItam();
	}
}
