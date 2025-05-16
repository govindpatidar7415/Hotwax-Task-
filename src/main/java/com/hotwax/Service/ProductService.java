package com.hotwax.Service;

import java.util.List;

import com.hotwax.Entities.Product;

public interface ProductService {
	Product saveProduct(Product product);

	List<Product> getAllProducts();

	Product getProductById(Long id);

	void deleteProduct(Long id);

	Product updateProduct(Long id, Product product);
}
