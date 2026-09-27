package com.example.geotherm.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.geotherm.model.EntryModel;
import com.example.geotherm.service.EntryService;
import java.util.*;

@RestController 
//http://localhost:8080/Entry
@RequestMapping("/Entry")
public class EntryController {

    private final EntryService ser;
    public EntryController(EntryService ser){
        this.ser=ser;
    }
    @PostMapping ("/create")
    //http://localhost:8080/Entry/create
    public EntryModel create(@RequestBody EntryModel data)
    {
        return ser.create(data);
    }
    @GetMapping ("/get")
    //http://localhost:8080/Entry/get
    public List<EntryModel> getData()
    {
        return ser.getData();
    }
    @PutMapping ("/update/{id}")
    //http://localhost:8080/Entry/update/{id}
    public EntryModel update(@PathVariable Long id,@RequestBody EntryModel data)
    {
        return ser.update(id,data);
    }
    @DeleteMapping ("/delete/{id}")
    //http://localhost:8080/Entry/delete
    public String delete(@PathVariable Long id)
    {
        ser.delete(id);
        return "Entry data deleted";
    }
}
