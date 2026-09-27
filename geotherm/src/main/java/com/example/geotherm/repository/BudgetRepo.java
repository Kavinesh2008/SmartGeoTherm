package com.example.geotherm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.geotherm.model.BudgetModel;

public interface BudgetRepo extends JpaRepository<BudgetModel,Long>{

}
