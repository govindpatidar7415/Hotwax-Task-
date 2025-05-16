package com.hotwax.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotwax.Entities.OrderHeader;

@Repository
public interface OrderHeaderRepository extends JpaRepository<OrderHeader, Long> {
}

