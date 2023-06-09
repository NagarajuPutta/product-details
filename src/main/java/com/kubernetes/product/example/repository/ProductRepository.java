package com.kubernetes.product.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kubernetes.product.example.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}

