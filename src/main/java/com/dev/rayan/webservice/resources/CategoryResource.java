package com.dev.rayan.webservice.resources;

import com.dev.rayan.webservice.entities.Category;
import com.dev.rayan.webservice.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService CategoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> CategoryList = CategoryService.findAll();
        return ResponseEntity.ok().body(CategoryList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category Category = CategoryService.findById(id);
        return ResponseEntity.ok().body(Category);
    }

}
