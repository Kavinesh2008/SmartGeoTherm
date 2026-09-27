package com.example.geotherm.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name = "payment")
public class PaymentModel {
    @Id 
    @GeneratedValue()
    private Long id;
    private String payment_number;
    private LocalDateTime payment_date;
    private String payment_type;
    private BigDecimal amount;
    private String payment_method;
    private String status;
    private String description;
    
}
