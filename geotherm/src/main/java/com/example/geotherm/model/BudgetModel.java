package com.example.geotherm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name = "budget")
public class BudgetModel {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String budget_name;
    private String budget_code;
    private Integer budget_year;
    private Double planned_expenses;
    private Double actual_expenses;
    private Double planned_revenue;
    private Double actual_revenue;
    private String status;
    private String description;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getBudget_name() {
        return budget_name;
    }
    public void setBudget_name(String budget_name) {
        this.budget_name = budget_name;
    }
    public String getBudget_code() {
        return budget_code;
    }
    public void setBudget_code(String budget_code) {
        this.budget_code = budget_code;
    }
    public Integer getBudget_year() {
        return budget_year;
    }
    public void setBudget_year(Integer budget_year) {
        this.budget_year = budget_year;
    }
    public Double getPlanned_expenses() {
        return planned_expenses;
    }
    public void setPlanned_expenses(Double planned_expenses) {
        this.planned_expenses = planned_expenses;
    }
    public Double getActual_expenses() {
        return actual_expenses;
    }
    public void setActual_expenses(Double actual_expenses) {
        this.actual_expenses = actual_expenses;
    }
    public Double getPlanned_revenue() {
        return planned_revenue;
    }
    public void setPlanned_revenue(Double planned_revenue) {
        this.planned_revenue = planned_revenue;
    }
    public Double getActual_revenue() {
        return actual_revenue;
    }
    public void setActual_revenue(Double actual_revenue) {
        this.actual_revenue = actual_revenue;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
}
