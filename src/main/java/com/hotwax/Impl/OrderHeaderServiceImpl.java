package com.hotwax.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotwax.Entities.OrderHeader;
import com.hotwax.Repository.OrderHeaderRepository;
import com.hotwax.Service.OrderHeaderService;

@Service
public class OrderHeaderServiceImpl implements OrderHeaderService {

	@Autowired
	private OrderHeaderRepository orderHeaderRepository;

	@Override
	public OrderHeader saveOrderHeader(OrderHeader orderHeader) {
		return orderHeaderRepository.save(orderHeader);
	}

	@Override
	public List<OrderHeader> getAllOrderHeaders() {
		return orderHeaderRepository.findAll();
	}

	@Override
	public OrderHeader getOrderHeaderById(Long id) {
		return orderHeaderRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteOrderHeader(Long id) {
		orderHeaderRepository.deleteById(id);
	}
}
