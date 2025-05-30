package com.hotwax.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotwax.Entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

