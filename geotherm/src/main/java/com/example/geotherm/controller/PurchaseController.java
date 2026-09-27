package com.example.geotherm.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.geotherm.model.PurchaseModel;
import com.example.geotherm.service.PurchaseService;

@RestController 
//http://localhost:8080/Purchase
@RequestMapping ("/Purchase")
public class PurchaseController {
    private PurchaseService ser;
    public PurchaseController(PurchaseService ser)
    {
        this.ser=ser;
    }
    @PostMapping ("/create")
    //http://localhost:8080/Purchase/create
    public PurchaseModel create(@RequestBody PurchaseModel data)
    {
        return ser.create(data);
    }
    @GetMapping ("/get")
    //http://localhost:8080/Purchase/get
    public java.util.List<PurchaseModel> getData()
    {
        return ser.getData();
    }
    @PutMapping ("/update/{id}")
    //http://localhost:8080/Purchase/update
    public PurchaseModel update(@PathVariable Long id,@RequestBody PurchaseModel data)
    {
        return ser.update(id,data);
    }
    @DeleteMapping ("/delete/{id}")
    //http://localhost:8080/Purchase/delete
    public String delete(@PathVariable Long id)
    {
        ser.delete(id);
        return "Purchase data deleted";
    }
}
