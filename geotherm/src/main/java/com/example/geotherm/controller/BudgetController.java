package com.example.geotherm.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.geotherm.model.BudgetModel;
import com.example.geotherm.service.BudgetService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@RestController 
//http://localhost:8080/budget
@RequestMapping("/budget")
public class BudgetController {
    private final BudgetService ser;
    public BudgetController(BudgetService ser){
        this.ser = ser;
    }
    @PostMapping ("/create")
    //http://localhost:8080/budget/create
    public BudgetModel create(@RequestBody BudgetModel data){
        return ser.create(data);
    }
    @GetMapping ("/get")
    //http://localhost:8080/budget/get
    public List<BudgetModel> getData(){
        return ser.getData();
    }
    @PutMapping ("/update/{id}")
    //http://localhost:8080/budget/update/1
    public BudgetModel update(@PathVariable Long id,@RequestBody BudgetModel data){
        return ser.update(id,data);
    }
    @DeleteMapping ("/delete/{id}")
    //http://localhost:8080/budget/delete/1
    public String delete(@PathVariable Long id){
        ser.delete(id);
        return "Deleted Successfully";
    }
}
