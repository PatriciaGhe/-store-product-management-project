package com.storemanagement.controller;

import com.storemanagement.model.*;
import com.storemanagement.service.impl.ProductServiceImpl;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductServiceImpl productService;

    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @PostMapping
    public Product addClothing(@RequestBody Clothing product) {
        return productService.save(product);
    }

    public Product addElectronics(@RequestBody Electronics product) {
        return productService.save(product);
    }

    public Product addJewelry(@RequestBody Jewelry product) {
        return productService.save(product);
    }

    public Product addShoes(@RequestBody Shoes product) {
        return productService.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id) {
        productService.delete(id);
    }
}
