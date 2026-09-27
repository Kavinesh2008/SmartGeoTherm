package com.example.geotherm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.geotherm.model.ContactModel;

public interface ContactRepo extends JpaRepository<ContactModel,Long>{

}
