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
@Table(name = "telemetry")
public class TelemetryModel {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne 
    @JoinColumn(name = "well_id")
    private WellModel well;
    private Double temperature;
    private Double pressure;
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
    public Double getHeat_output() {
        return heat_output;
    }
    public void setHeat_output(Double heat_output) {
        this.heat_output = heat_output;
    }
    public String getPressure_status() {
        return pressure_status;
    }
    public void setPressure_status(String pressure_status) {
        this.pressure_status = pressure_status;
    }
    public LocalDateTime getRecorded_at() {
        return recorded_at;
    }
    public void setRecorded_at(LocalDateTime recorded_at) {
        this.recorded_at = recorded_at;
    }
    private Double flow_rate;
    private Double heat_output;
    private String pressure_status;
    private LocalDateTime recorded_at;
}
