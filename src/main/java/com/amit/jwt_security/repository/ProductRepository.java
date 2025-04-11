package com.amit.jwt_security.repository;

import com.amit.jwt_security.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
