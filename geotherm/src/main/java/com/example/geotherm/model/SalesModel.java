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
@Table (name="sales")
public class SalesModel {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne 
    @JoinColumn (name="customer_id")
    private ContactModel customer;
    @ManyToOne
    @JoinColumn (name="product_id")
    private ProductModel product;
    private String order_number;
    private LocalDateTime order_date;
    private Double quantity;
    private BigDecimal unit_price;
    private BigDecimal total_amount;
    private String status;
    private String description;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public ContactModel getCustomer() {
        return customer;
    }
    public void setCustomer(ContactModel customer) {
        this.customer = customer;
    }
    public ProductModel getProduct() {
        return product;
    }
    public void setProduct(ProductModel product) {
        this.product = product;
    }
    public String getOrder_number() {
        return order_number;
    }
    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }
    public LocalDateTime getOrder_date() {
        return order_date;
    }
    public void setOrder_date(LocalDateTime order_date) {
        this.order_date = order_date;
    }
    public Double getQuantity() {
        return quantity;
    }
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
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
