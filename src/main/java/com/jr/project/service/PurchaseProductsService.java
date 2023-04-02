package com.jr.project.service;

import com.jr.project.model.Purchase;
import com.jr.project.model.PurchaseProducts;
import com.jr.project.repository.PurchaseProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseProductsService {

    @Autowired
    private PurchaseProductsRepository purchaseProductsRepository;

    public PurchaseProducts save(PurchaseProducts purchaseProducts){
        return purchaseProductsRepository.save(purchaseProducts);
    }

    public List<PurchaseProducts> list(){
        return purchaseProductsRepository.findAll();
    }

    public Optional<PurchaseProducts> findById(Long id){
        return purchaseProductsRepository.findById(id);
    }

    public void removeById(Long id){
        purchaseProductsRepository.deleteById(id);
    }

    public List<PurchaseProducts> findByPurchaseId(Long purchaseId){
        return purchaseProductsRepository.findByPurchaseId(purchaseId);
    }


}
