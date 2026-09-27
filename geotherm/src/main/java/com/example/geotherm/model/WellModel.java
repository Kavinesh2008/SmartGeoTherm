package com.example.geotherm.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "well")
public class WellModel {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String well_name;
    private String location;
    private Double temperature;
    private Double pressure;
    public Double getThermal_efficiency() {
        return thermal_efficiency;
    }
    public void setThermal_efficiency(Double thermal_efficiency) {
        this.thermal_efficiency = thermal_efficiency;
    }
    private Double flow_rate;
    private Double thermal_efficiency;
    private String status;
    private LocalDateTime installed_date;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getWell_name() {
        return well_name;
    }
    public void setWell_name(String well_name) {
        this.well_name = well_name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Double getTemperature() {
        return temperature;
    }
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }
    public Double getPressure() {
        return pressure;
    }
    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }
    public Double getFlow_rate() {
        return flow_rate;
    }
    public void setFlow_rate(Double flow_rate) {
        this.flow_rate = flow_rate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public LocalDateTime getInstalled_date() {
        return installed_date;
    }
    public void setInstalled_date(LocalDateTime installed_date) {
        this.installed_date = installed_date;
    }
    
}
