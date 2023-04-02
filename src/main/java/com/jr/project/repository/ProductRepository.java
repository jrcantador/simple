package com.jr.project.repository;

import com.jr.project.model.Product;
import com.jr.project.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
