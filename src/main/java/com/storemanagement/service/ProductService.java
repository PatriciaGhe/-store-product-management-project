package com.storemanagement.service;

import com.storemanagement.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();
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

}
