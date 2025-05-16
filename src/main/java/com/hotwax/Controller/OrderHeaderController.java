package com.hotwax.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotwax.Entities.OrderHeader;
import com.hotwax.Service.OrderHeaderService;

@RestController
@RequestMapping("/orders")
public class OrderHeaderController {

	@Autowired
	private OrderHeaderService orderHeaderService;

	@PostMapping
	public OrderHeader saveOrder(@RequestBody OrderHeader orderHeader) {
		return orderHeaderService.saveOrderHeader(orderHeader);
	}

	@GetMapping
	public List<OrderHeader> getAllOrders() {
		return orderHeaderService.getAllOrderHeaders();
	}

	@GetMapping("/{id}")
	public OrderHeader getOrderById(@PathVariable Long id) {
		return orderHeaderService.getOrderHeaderById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteOrder(@PathVariable Long id) {
		orderHeaderService.deleteOrderHeader(id);
	}
}
