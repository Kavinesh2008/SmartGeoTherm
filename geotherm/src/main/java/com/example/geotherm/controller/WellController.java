package com.example.geotherm.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.geotherm.model.WellModel;
import com.example.geotherm.service.WellService;
import java.util.*;

@RestController 
//http://localhost:8080/Well
@RequestMapping("/Well")
public class WellController {
    private final WellService ser;

    public WellController(WellService ser)
    {
        this.ser = ser;
    }
    @PostMapping("/create")
    //http://localhost:8080/Well/create
    public WellModel create(@RequestBody WellModel data)
    {
        return ser.create(data);
    }
    @GetMapping("/get")
    //http://localhost:8080/Well/get
    public List<WellModel> getData()
    {
        return ser.getData();
    }
    @PutMapping("/update/{id}")
    //http://localhost:8080/Well/update
    public WellModel update(@PathVariable Long id,@RequestBody WellModel data)
    {
        return ser.update(id,data);
    }
    @DeleteMapping("/delete/{id}")
    //http://localhost:8080/Well/delete
    public String delete(@PathVariable Long id)
    {
        ser.delete(id);
        return "Well data deleted";
    }
}
