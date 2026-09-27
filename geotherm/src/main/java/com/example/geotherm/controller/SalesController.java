package com.example.geotherm.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.geotherm.model.SalesModel;
import com.example.geotherm.service.SalesService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@RestController 
//http://localhost:8080/Sales
@RequestMapping("/sales")
public class SalesController {
    private final SalesService ser;
    public SalesController(SalesService ser)
    {
        this.ser = ser;
    }
    @PostMapping ("/create")
    //http://localhost:8080/Sales/create
    public SalesModel create(@RequestBody  SalesModel data)
    {
        return ser.create(data);
    }
    @GetMapping ("/get")
    //http://localhost:8080/Sales/get
    public List<SalesModel> get()
    {
        return ser.getData();
    }
    @PutMapping ("/update/{id}")
    //http://localhost:8080/Sales/update
    public SalesModel update(@PathVariable  Long id,@RequestBody  SalesModel data)
    {
        return ser.update(id,data);
    }
    @DeleteMapping ("/delete/{id}")
    //http://localhost:8080/Sales/delete
    public String delete(@PathVariable Long id)
    {
        ser.delete(id);
        return "Deleted Successfully";
    }
}
