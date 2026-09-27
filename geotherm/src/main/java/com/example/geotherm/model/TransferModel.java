package com.example.geotherm.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name = "transfer")
public class TransferModel {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne 
    @JoinColumn (name="well_id")
    private WellModel well;
    @ManyToOne 
    @JoinColumn(name="customer_id")
    private ContactModel contact;
    private Double energy_gj;
    private Double transfer_temperature;
    private LocalDateTime transfer_date;
    private String status;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public WellModel getWell() {
        return well;
    }
    public void setWell(WellModel well) {
        this.well = well;
    }
    public ContactModel getContact() {
        return contact;
    }
    public void setContact(ContactModel contact) {
        this.contact = contact;
    }
    public Double getEnergy_gj() {
        return energy_gj;
    }
    public void setEnergy_gj(Double energy_gj) {
        this.energy_gj = energy_gj;
    }
    public Double getTransfer_temperature() {
        return transfer_temperature;
    }
    public void setTransfer_temperature(Double transfer_temperature) {
        this.transfer_temperature = transfer_temperature;
    }
    public LocalDateTime getTransfer_date() {
        return transfer_date;
    }
    public void setTransfer_date(LocalDateTime transfer_date) {
        this.transfer_date = transfer_date;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
}
