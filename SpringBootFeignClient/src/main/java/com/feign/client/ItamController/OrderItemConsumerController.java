package com.feign.client.ItamController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feign.client.model.OrderItemService;

@RestController
@RequestMapping(value="/orderItem")
public class OrderItemConsumerController {

	@Autowired
     private OrderItemFiegnClient fClient;
	@PostMapping(value="/save")
	public OrderItemService saveItem(@RequestBody OrderItemService service) {
		 return fClient.saveItemOrder(service);
	}
	@GetMapping(value="/getItems")
	public OrderItemService getAll() {
	return	fClient.getAllOrderItem();
	}
}
