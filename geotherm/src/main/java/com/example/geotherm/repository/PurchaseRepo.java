package com.example.geotherm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.geotherm.model.PurchaseModel;

public interface PurchaseRepo extends JpaRepository<PurchaseModel,Long>{

}
