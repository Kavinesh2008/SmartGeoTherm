package com.example.geotherm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.geotherm.model.WellModel;

public interface WellRepo extends JpaRepository<WellModel,Long>{

}
