package com.amit.jwt_security.service;

import com.amit.jwt_security.Entity.Product;
import com.amit.jwt_security.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService {
    @Autowired
    private final ProductRepository productRepository;

    // Get All Product
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    // Get Product By ID

    public Optional<Product> getProductById(@PathVariable Long id) {
        return productRepository.findById(id);
    }


    //Save / Update Product
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Delete product

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }


}
