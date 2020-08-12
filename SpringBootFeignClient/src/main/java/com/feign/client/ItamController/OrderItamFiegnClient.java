package com.feign.client.ItamController;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.feign.client.model.OrderItamService;

@FeignClient(name="ORDERITAMSERVICE")
public interface OrderItamFiegnClient {

	@PostMapping(value="/orderItamService/saveItam")
	public OrderItamService saveItamOrder(OrderItamService service);
	@GetMapping(value="/orderItamService/getAllItams")
	public OrderItamService getAllOrderItam();
}
