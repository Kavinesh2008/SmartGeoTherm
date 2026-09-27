package com.example.geotherm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.geotherm.model.JournalModel;

public interface JournalRepo extends JpaRepository<JournalModel,Long>{

}
