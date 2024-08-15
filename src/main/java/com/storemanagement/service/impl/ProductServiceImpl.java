package com.storemanagement.service.impl;

import com.storemanagement.model.Product;
import com.storemanagement.service.ProductService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class ProductServiceImpl implements ProductService {

    private List<Product> products = new ArrayList<Product>();
    private Long currentId = 1L;

    public List<Product> findAll() {
        return products;
    }

    public Product save(Product product) {
        product.setId(currentId++);
        products.add(product);
        return product;
    }

    public void delete(Long id) {
        products = products.stream()
                .filter(product -> !product.getId().equals(id))
                .collect(Collectors.toList());
    }

    public Optional<Product> findById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product getProductById(Long id) {
        return getProductById(currentId);
    }

    @Override
    public void deleteProductById(Long id) {

    }
}
