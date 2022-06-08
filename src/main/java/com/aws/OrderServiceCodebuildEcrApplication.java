package com.aws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/orders")
public class OrderServiceCodebuildEcrApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceCodebuildEcrApplication.class, args);
	}

	@Autowired
	private OrderDao orderDao;

	@GetMapping
	public List<Order> fetchOrders() {
		return orderDao.getOrders();//.stream().sorted(Comparator.comparing(Order::getPrice)).collect(Collectors.toList());
	}
}
