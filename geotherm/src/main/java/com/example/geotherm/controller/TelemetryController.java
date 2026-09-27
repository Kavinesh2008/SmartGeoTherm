package com.example.geotherm.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.geotherm.model.TelemetryModel;
import com.example.geotherm.service.TelemetryService;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.*;

@RestController 
//http://localhost:8080/Telemetry
@RequestMapping("/Telemetry")
public class TelemetryController {
    @Id 
    @GeneratedValue()

    private final TelemetryService ser;
    public TelemetryController(TelemetryService ser)
    {
        this.ser = ser;
    }
    @PostMapping("/create")
    //http://localhost:8080/Telemetry/create
    public TelemetryModel create(@RequestBody TelemetryModel data)
    {
        return ser.create(data);
    }
    @GetMapping("/get")
    //http://localhost:8080/Telemetry/get
    public List<TelemetryModel> getData(){
        return ser.getData();
    }
    @PutMapping("/update/{id}")
    //http://localhost:8080/Telemetry/update
    public TelemetryModel update(@PathVariable Long id,@RequestBody TelemetryModel data)
    {
        return ser.update(id,data);
    }
    @DeleteMapping("/delete/{id}")
    //http://localhost:8080/Telemetry/delete
    public String delete(@PathVariable Long id)
    {
        ser.delete(id);
        return "Telemetry data deleted";
    }
}
