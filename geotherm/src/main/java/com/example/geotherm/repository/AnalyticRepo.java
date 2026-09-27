package com.example.geotherm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.geotherm.model.AnalyticModel;

public interface AnalyticRepo extends JpaRepository<AnalyticModel,Long>{

}
