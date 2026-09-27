package com.example.geotherm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.geotherm.model.ProductModel;

public interface ProductRepo extends JpaRepository<ProductModel,Long>{

}
