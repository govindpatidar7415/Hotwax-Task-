package com.hotwax.Service;


import java.util.List;

import com.hotwax.Entities.OrderItem;

public interface OrderItemService {
	OrderItem saveOrderItem(OrderItem orderItem);

	List<OrderItem> getAllOrderItems();

	OrderItem getOrderItemById(Long id);

	void deleteOrderItem(Long id);
}
