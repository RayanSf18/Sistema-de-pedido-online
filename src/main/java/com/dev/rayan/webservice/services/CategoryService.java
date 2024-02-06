package com.dev.rayan.webservice.services;

import com.dev.rayan.webservice.entities.Category;
import com.dev.rayan.webservice.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository CategoryRepository;

    public List<Category> findAll() {
        return CategoryRepository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> optionalCategory = CategoryRepository.findById(id);
        return optionalCategory.get();
    }

}
