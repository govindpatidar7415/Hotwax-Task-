package com.hotwax.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotwax.Entities.OrderItem;
import com.hotwax.Service.OrderItemService;

@RestController
@RequestMapping("/order-items")
public class OrderItemController {

	@Autowired
	private OrderItemService orderItemService;

	@PostMapping
	public OrderItem saveOrderItem(@RequestBody OrderItem orderItem) {
	    return orderItemService.saveOrderItem(orderItem);
	}


	@GetMapping
	public List<OrderItem> getAllOrderItems() {
		return orderItemService.getAllOrderItems();
	}

	@GetMapping("/{id}")
	public OrderItem getOrderItemById(@PathVariable Long id) {
		return orderItemService.getOrderItemById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteOrderItem(@PathVariable Long id) {
		orderItemService.deleteOrderItem(id);
	}

	// PUT endpoint for updating OrderItem with versioning
	@PutMapping("/{id}")
	public ResponseEntity<OrderItem> updateOrderItem(@PathVariable Long id, @RequestBody OrderItem orderItemDetails) {
	    OrderItem existingItem = orderItemService.getOrderItemById(id);
	    if (existingItem == null) {
	        return ResponseEntity.notFound().build();
	    }

	    // Don't set the version manually
	    existingItem.setQuantity(orderItemDetails.getQuantity());
	    existingItem.setProduct(orderItemDetails.getProduct());
	    existingItem.setOrderHeader(orderItemDetails.getOrderHeader());

	    try {
	        OrderItem updatedItem = orderItemService.saveOrderItem(existingItem);
	        return ResponseEntity.ok(updatedItem);
	    } catch (Exception e) {
	        // Handle version mismatch here (OptimisticLockException)
	        return ResponseEntity.status(409).body(null); // Conflict (409) if version mismatch occurs
	    }
	}

}
