package com.example.geotherm.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.geotherm.model.ContactModel;
import com.example.geotherm.service.ContactService;
import java.util.*;

@RestController 
//http://localhost:8080/Contact
@RequestMapping("Contact")
public class ContactController {

    private final ContactService ser;

    public ContactController(ContactService ser)
    {
        this.ser = ser;
    }

    @PostMapping("/create")
    //http://localhost:8080/Contact/create
    public ContactModel create(@RequestBody ContactModel data)
    {
        return ser.create(data);
    }
    @GetMapping("/get")
    //http://localhost:8080/Contact/get
    public List<ContactModel> getData()
    {
        return ser.getData();
    }
    @PutMapping("update/{id}")
    //http://localhost:8080/Contact/update
    public ContactModel update(@PathVariable Long id,@RequestBody ContactModel data)
    {
        return ser.update(id,data);
    }
    @DeleteMapping("/delete/{id}")
    //http://localhost:8080/Contact/delete
    public String delete(@PathVariable Long id)
    {
        ser.delete(id);
        return "Contact data deleted";
    }
}
