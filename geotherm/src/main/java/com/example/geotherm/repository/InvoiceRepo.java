package com.example.geotherm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.geotherm.model.InvoiceModel;

public interface InvoiceRepo extends JpaRepository<InvoiceModel,Long>{

}
