package com.example.geotherm.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.geotherm.model.TransferModel;
import com.example.geotherm.service.TransferService;
import java.util.*;

@RestController 
@RequestMapping("/Transfer")
//http://localhost:8080/Transfer
public class TransferController {

    private final TransferService ser;
    public TransferController(TransferService ser)
    {
        this.ser = ser;
    }

    @PostMapping("/create")
    //http://localhost:8080/Transfer/create
    public TransferModel create(@RequestBody TransferModel data)
    {
        return ser.create(data);
    }
    @GetMapping("/get")
    //http://localhost:8080/Transfer/get
    public List<TransferModel> getData()
    {
        return ser.getData();
    }
    @PutMapping("/update/{id}")
    //http://localhost:8080/Transfer/update
    public TransferModel update(@PathVariable Long id,@RequestBody TransferModel data)
    {
        return ser.update(id,data);
    }
    @DeleteMapping("/delete/{id}")
    //http://localhost:8080/Transfer/delete
    public String delete(@PathVariable Long id)
    {
        ser.delete(id);
        return "Tranfer data deleted";
    }
}
