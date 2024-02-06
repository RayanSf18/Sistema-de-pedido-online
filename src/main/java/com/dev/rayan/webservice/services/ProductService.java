package com.dev.rayan.webservice.services;

import com.dev.rayan.webservice.entities.Product;
import com.dev.rayan.webservice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository ProductRepository;

    public List<Product> findAll() {
        return ProductRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> optionalProduct = ProductRepository.findById(id);
        return optionalProduct.get();
    }

}
