package com.hotwax.Service;

import java.util.List;

import com.hotwax.Entities.OrderHeader;

public interface OrderHeaderService {
	OrderHeader saveOrderHeader(OrderHeader orderHeader);

	List<OrderHeader> getAllOrderHeaders();

	OrderHeader getOrderHeaderById(Long id);

	void deleteOrderHeader(Long id);
}
