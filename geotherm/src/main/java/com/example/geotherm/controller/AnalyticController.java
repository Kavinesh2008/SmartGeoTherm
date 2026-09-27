package com.example.geotherm.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.geotherm.model.AnalyticModel;
import com.example.geotherm.service.AnalyticService;

@RestController 
//http://localhost:8080/Analytic
@RequestMapping("/Analytic")
public class AnalyticController {
    private final AnalyticService ser;
    public AnalyticController(AnalyticService ser)
    {
        this.ser = ser;
    }
    @PostMapping ("/create")
    //http://localhost:8080/Analytic/create
    public AnalyticModel create(@RequestBody AnalyticModel data)
    {
        return ser.create(data);
    }
    @GetMapping("/get")
    //http://localhost:8080/Analytic/get
    public List<AnalyticModel> getData()
    {
        return ser.getData();
    }
    @PutMapping ("/update/{id}")
    //http://localhost:8080/Analytic/update/1
    public AnalyticModel update(@PathVariable Long id,@RequestBody AnalyticModel data)
    {
        return ser.update(id,data);
    }
    @DeleteMapping ("/delete/{id}")
    //http://localhost:8080/Analytic/delete/1
    public String delete(@PathVariable Long id)
    {
        ser.delete(id);
        return "Analytic deleted successfully";
    }
}
