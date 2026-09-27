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
@Table (name="bill")
public class BillModel {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne 
    @JoinColumn (name="purchase_id")
    private PurchaseModel purchase;
    @ManyToOne 
    @JoinColumn (name="vendor_id")
    private ContactModel vendor;
    private String bill_number;
    private LocalDateTime bill_date;
    private LocalDateTime due_date;
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
    public PurchaseModel getPurchase() {
        return purchase;
    }
    public void setPurchase(PurchaseModel purchase) {
        this.purchase = purchase;
    }
    public ContactModel getVendor() {
        return vendor;
    }
    public void setVendor(ContactModel vendor) {
        this.vendor = vendor;
    }
    public String getBill_number() {
        return bill_number;
    }
    public void setBill_number(String bill_number) {
        this.bill_number = bill_number;
    }
    public LocalDateTime getBill_date() {
        return bill_date;
    }
    public void setBill_date(LocalDateTime bill_date) {
        this.bill_date = bill_date;
    }
    public LocalDateTime getDue_date() {
        return due_date;
    }
    public void setDue_date(LocalDateTime due_date) {
        this.due_date = due_date;
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
