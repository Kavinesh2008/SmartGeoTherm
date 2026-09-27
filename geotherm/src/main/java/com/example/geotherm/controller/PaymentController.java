package com.example.geotherm.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.geotherm.model.PaymentModel;
import com.example.geotherm.service.PaymentService;
import java.util.List;

@RestController 
//http://localhost:8080/Payment
@RequestMapping ("/Payment")
public class PaymentController {
    private final PaymentService ser;
    public PaymentController(PaymentService ser){
        this.ser = ser;
    }
    @PostMapping ("/create")
    //http://localhost:8080/Payment/create
    public PaymentModel create(@RequestBody PaymentModel data){
        return ser.create(data);
    }
    @GetMapping ("/get")
    //http://localhost:8080/Payment/get
    public List<PaymentModel> getData()
    {
        return ser.getData();
    }
    @PutMapping ("/update/{id}")
    //http://localhost:8080/Payment/update/{id}
    public PaymentModel update(@PathVariable Long id, @RequestBody PaymentModel data){
        return ser.update(id,data);
    }
    @DeleteMapping ("/delete/{id}")
    //http://localhost:8080/Payment/delete
    public String delete(@PathVariable Long id)
    {
        ser.delete(id);
        return "Payment deleted successfully";
    }
}
