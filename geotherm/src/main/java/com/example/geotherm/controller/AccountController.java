package com.example.geotherm.controller;

import com.example.geotherm.repository.AccountRepo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.geotherm.model.AccountModel;
import com.example.geotherm.service.AccountService;
import java.util.*;

@RestController 
@RequestMapping("/Account")
//http://localhost:8080/Account
public class AccountController {

    private final AccountService ser;
    public AccountController(AccountService service, AccountRepo accountRepo){
        this.ser = service;
    }
    @PostMapping("/create")
    //http://localhost:8080/Account/create
    public AccountModel create(@RequestBody AccountModel data)
    {
        return ser.create(data);
    }
    @GetMapping("/get")
    //http://localhost:8080/Account/get
    public List<AccountModel> getData()
    {
        return ser.getData();
    }
    @PutMapping("/update/{id}")
    //http://localhost:8080/Account/update/1
    public AccountModel update(@PathVariable Long id,@RequestBody AccountModel data)
    {
        return ser.update(id,data);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id)
    {
        ser.delete(id);
        return "Account deleted";
    }
}
