package com.jr.project.repository;

import com.jr.project.model.PurchaseProducts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface PurchaseProductsRepository extends JpaRepository<PurchaseProducts, Long> {

    List<PurchaseProducts> findByPurchaseId(Long purchaseId);
}
