package com.storemanagement.controller;

import com.storemanagement.model.Clothing;
import com.storemanagement.model.Product;
import com.storemanagement.service.ProductService;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
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
    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id) {
        productService.delete(id);
    }
}
