package com.example.geotherm.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.geotherm.model.BillModel;
import com.example.geotherm.service.BillService;
import java.util.List;

@RestController 
//http://localhost:8080/Bill
@RequestMapping ("/Bill")
public class BillController {

    private final BillService ser;
    public BillController(BillService ser)
    {
        this.ser = ser;
    }
    @PostMapping ("/create")
    //http://localhost:8080/Bill/create
    public BillModel create(@RequestBody BillModel data)
    {
        return ser.create(data);
    }
    @GetMapping ("/get")
    //http://localhost:8080/Bill/get
    public List<BillModel> get()
    {
        return ser.getData();
    }
    @PutMapping ("/update/{id}")
    //http://localhost:8080/Bill/update
    public BillModel update(@PathVariable Long id,@RequestBody BillModel data)
    {
        return ser.update(id,data);
    }
    @DeleteMapping ("/delete/{id}")
    //http://localhost:8080/Bill/delete
    public String delete(@PathVariable Long id)
    {
        ser.delete(id);
        return "Deleted Successfully";
    }
}
