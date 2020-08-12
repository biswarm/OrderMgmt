package com.order.service.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderItemsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderItemsServiceApplication.class, args);
	}

}
