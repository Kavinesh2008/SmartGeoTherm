package com.example.geotherm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.geotherm.model.SalesModel;

public interface SalesRepo extends JpaRepository<SalesModel,Long>{

}
