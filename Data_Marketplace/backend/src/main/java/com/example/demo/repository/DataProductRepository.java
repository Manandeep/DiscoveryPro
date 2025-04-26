package com.example.demo.repository;

import com.example.demo.model.DataProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataProductRepository extends JpaRepository<DataProduct, Long> {
}
