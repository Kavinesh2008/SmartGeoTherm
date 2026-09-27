package com.example.geotherm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name = "analytic")
public class AnalyticModel {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String analytic_name;
    private String analytic_code;
    private Double revenue;
    private Double expenses;
    private String description;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getAnalytic_name() {
        return analytic_name;
    }
    public void setAnalytic_name(String analytic_name) {
        this.analytic_name = analytic_name;
    }
    public String getAnalytic_code() {
        return analytic_code;
    }
    public void setAnalytic_code(String analytic_code) {
        this.analytic_code = analytic_code;
    }
    public Double getRevenue() {
        return revenue;
    }
    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }
    public Double getExpenses() {
        return expenses;
    }
    public void setExpenses(Double expenses) {
        this.expenses = expenses;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
}
