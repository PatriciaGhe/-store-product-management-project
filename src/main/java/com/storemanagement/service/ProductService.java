package com.storemanagement.service;

import com.storemanagement.model.Product;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    void deleteProductById(Long id);

    List<Product> findAll();
}
