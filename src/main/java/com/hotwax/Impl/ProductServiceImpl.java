package com.hotwax.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotwax.Entities.Product;
import com.hotwax.Repository.ProductRepository;
import com.hotwax.Service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		return productRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}
	@Override
	public Product updateProduct(Long id, Product product) {
	    Product existingProduct = productRepository.findById(id).orElse(null);
	    if (existingProduct != null) {
	        existingProduct.setName(product.getName());
	        existingProduct.setDescription(product.getDescription());
	        existingProduct.setPrice(product.getPrice());
	        return productRepository.save(existingProduct);
	    } else {
	        return null;
	    }
	}
	
}
