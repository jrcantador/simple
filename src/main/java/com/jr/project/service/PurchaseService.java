package com.jr.project.service;

import com.jr.project.model.Purchase;
import com.jr.project.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;    

    public Purchase save(Purchase purchase){
       return purchaseRepository.save(purchase);
    }

    public List<Purchase> list(){
        return purchaseRepository.findAll();
    }

    public Optional<Purchase> findById(Long id){
        return purchaseRepository.findById(id);
    }

    public void removeById(Long id){
        purchaseRepository.deleteById(id);
    }


}
