package com.example.geotherm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.geotherm.model.TelemetryModel;

public interface TelemetryRepo extends JpaRepository<TelemetryModel,Long>{

}
