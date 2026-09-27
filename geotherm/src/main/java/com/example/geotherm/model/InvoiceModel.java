package com.example.geotherm.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table (name="invoice")
public class InvoiceModel {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne 
    @JoinColumn (name="sales_id")
    private SalesModel sales;
    @ManyToOne 
    @JoinColumn (name="customer_id")
    private ContactModel customer;
    private String invoice_number;
    private LocalDateTime invoice_date;
    private LocalDateTime due_date;
    private Double energy_gj;
    private BigDecimal unit_price;
    private BigDecimal total_amount;
    private BigDecimal paid_amount;
    private String status;
    private String description;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public SalesModel getSales() {
        return sales;
    }
    public void setSales(SalesModel sales) {
        this.sales = sales;
    }
    public ContactModel getCustomer() {
        return customer;
    }
    public void setCustomer(ContactModel customer) {
        this.customer = customer;
    }
    public String getInvoice_number() {
        return invoice_number;
    }
    public void setInvoice_number(String invoice_number) {
        this.invoice_number = invoice_number;
    }
    public LocalDateTime getInvoice_date() {
        return invoice_date;
    }
    public void setInvoice_date(LocalDateTime invoice_date) {
        this.invoice_date = invoice_date;
    }
    public LocalDateTime getDue_date() {
        return due_date;
    }
    public void setDue_date(LocalDateTime due_date) {
        this.due_date = due_date;
    }
    public Double getEnergy_gj() {
        return energy_gj;
    }
    public void setEnergy_gj(Double energy_gj) {
        this.energy_gj = energy_gj;
    }
    public BigDecimal getUnit_price() {
        return unit_price;
    }
    public void setUnit_price(BigDecimal unit_price) {
        this.unit_price = unit_price;
    }
    public BigDecimal getTotal_amount() {
        return total_amount;
    }
    public void setTotal_amount(BigDecimal total_amount) {
        this.total_amount = total_amount;
    }
    public BigDecimal getPaid_amount() {
        return paid_amount;
    }
    public void setPaid_amount(BigDecimal paid_amount) {
        this.paid_amount = paid_amount;
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
