package com.example.geotherm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.geotherm.model.AccountModel;

public interface AccountRepo extends JpaRepository<AccountModel,Long>{

}
