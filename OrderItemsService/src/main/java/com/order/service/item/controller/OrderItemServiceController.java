package com.order.service.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.service.item.model.OrderItemService;
import com.order.service.item.service.OrderItemBussinessService;

@RestController
@RequestMapping(value="/orderItemService")
public class OrderItemServiceController {

	@Autowired
    private OrderItemBussinessService service;
	
	@PostMapping(value="/saveItem")
	public OrderItemService saveOrderItem(@RequestBody OrderItemService orderItem) {
		return service.saveOrderItem(orderItem);
	}
	@GetMapping(value="/getAllItems")
	public List<OrderItemService> getAllOrderItem() {
		return service.getAllOrderItem();
	}
}
