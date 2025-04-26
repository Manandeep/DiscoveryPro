package com.example.demo.controller;

import com.example.demo.model.DataProduct;
import com.example.demo.repository.DataProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/data-products")
public class DataProductController {

    @Autowired
    private DataProductRepository dataProductRepository;

    // Get all data products
    @GetMapping
    public List<DataProduct> getAll() {
        return dataProductRepository.findAll();
    }

    // Get one data product by ID
    @GetMapping("/{id}")
    public DataProduct getById(@PathVariable Long id) {
        return dataProductRepository.findById(id).orElse(null);
    }

    // Search by keyword
    @GetMapping("/search")
    public List<DataProduct> searchByName(@RequestParam String keyword) {
        return dataProductRepository.findByNameContaining(keyword);
    }

    // Create a new data product
    @PostMapping
    public DataProduct create(@RequestBody DataProduct dataProduct) {
        return dataProductRepository.save(dataProduct);
    }

    // Update a data product
    @PutMapping("/{id}")
    public DataProduct update(@PathVariable Long id, @RequestBody DataProduct updated) {
        return dataProductRepository.findById(id).map(product -> {
            product.setName(updated.getName());
            product.setDescription(updated.getDescription());
            product.setTechnicalDetails(updated.getTechnicalDetails());
            return dataProductRepository.save(product);
        }).orElse(null);
    }
}
