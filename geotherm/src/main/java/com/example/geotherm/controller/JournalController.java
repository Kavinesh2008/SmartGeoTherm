package com.example.geotherm.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.geotherm.model.JournalModel;
import com.example.geotherm.service.JournalService;
import java.util.*;

@RestController 
//http://localhost:8080/Journal
@RequestMapping ("/Journal")
public class JournalController {

    private final JournalService ser;
    public JournalController(JournalService ser)
    {
        this.ser = ser;
    }
    @PostMapping ("/create")
    //http://localhost:8080/Journal/create
    public JournalModel create(@RequestBody JournalModel data)
    {
        return ser.create(data);
    }
    @GetMapping ("/get")
    //http://localhost:8080/Journal/get
    public List<JournalModel> getData()
    {
        return ser.getData();
    }
    @PutMapping ("/update/{id}")
    //http://localhost:8080/Journal/update
    public JournalModel update(@PathVariable Long id,@RequestBody JournalModel data)
    {
        return ser.update(id, data);
    }
    @DeleteMapping ("/delete/{id}")
    //http://localhost:8080/Journal/delete
    public String delete(@PathVariable Long id)
    {
        ser.delete(id);
        return "Journal data deleted";
    }
}
