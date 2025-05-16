package com.hotwax.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotwax.Entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

