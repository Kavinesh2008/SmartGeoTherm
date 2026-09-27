package com.example.geotherm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.geotherm.model.TransferModel;

public interface TransferRepo extends JpaRepository<TransferModel,Long>{

}
