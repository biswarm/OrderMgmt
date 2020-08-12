package com.feign.client.ItamController;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.feign.client.model.OrderItemService;

@FeignClient(name="ORDERITEMSERVICE")
public interface OrderItemFiegnClient {

	@PostMapping(value="/orderItemService/saveItem")
	public OrderItemService saveItemOrder(OrderItemService service);
	@GetMapping(value="/orderItemService/getAllItems")
	public OrderItemService getAllOrderItem();
}
