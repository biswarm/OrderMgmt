package com.feign.client.ItamController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feign.client.model.OrderItamService;

@RestController
@RequestMapping(value="/orderItam")
public class OrederItamConsumerController {

	@Autowired
     private OrderItamFiegnClient fClient;
	@PostMapping(value="/save")
	public OrderItamService saveItam(@RequestBody OrderItamService service) {
		 return fClient.saveItamOrder(service);
	}
	@GetMapping(value="/getItams")
	public OrderItamService getAll() {
	return	fClient.getAllOrderItam();
	}//http://localhost:8524/orderItam/
}
