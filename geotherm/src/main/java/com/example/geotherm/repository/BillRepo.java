package com.example.geotherm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.geotherm.model.BillModel;

public interface BillRepo extends JpaRepository<BillModel,Long>{

}
