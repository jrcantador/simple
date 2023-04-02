package com.jr.project.controller;

import com.jr.project.model.PurchaseProducts;
import com.jr.project.service.PurchaseProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/purchase-products")
public class PurchaseProductsController {
    @Autowired
    private PurchaseProductsService PurchaseProductsService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PurchaseProducts save(@RequestBody PurchaseProducts purchaseProducts) {
        return PurchaseProductsService.save(purchaseProducts);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PurchaseProducts> list() {
        return PurchaseProductsService.list();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PurchaseProducts findById(@PathVariable("id") Long id) {
        return PurchaseProductsService.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Not Found"));
    }

    @GetMapping("/purchase/{purchaseId}")
    @ResponseStatus(HttpStatus.OK)
    public List<PurchaseProducts> findPurchaseId(@PathVariable("purchaseId") Long id) {
        return PurchaseProductsService.findByPurchaseId(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remove(Long id) {
        PurchaseProductsService.findById(id).map(purchaseProducts -> {
            PurchaseProductsService.removeById(purchaseProducts.getId());
            return Void.TYPE;
        }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Not Found"));
    }
}
