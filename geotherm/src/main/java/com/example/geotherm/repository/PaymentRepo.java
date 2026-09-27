package com.example.geotherm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.geotherm.model.PaymentModel;

public interface PaymentRepo extends JpaRepository<PaymentModel,Long>{

}
