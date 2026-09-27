package com.example.geotherm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.geotherm.model.EntryModel;

public interface EntryRepo extends JpaRepository<EntryModel,Long>{

}
