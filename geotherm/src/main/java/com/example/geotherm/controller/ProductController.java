package com.example.geotherm.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.geotherm.model.ProductModel;
import com.example.geotherm.service.ProductService;
import java.util.List;

@RestController 
@RequestMapping("/Product")
//http://localhost:8080/Product
public class ProductController {
    private final ProductService ser;
    public ProductController(ProductService ser)
    {
        this.ser=ser;
    }
    @PostMapping ("/create")
    //http://localhost:8080/Product/create
    public ProductModel create(@RequestBody ProductModel data)
    {
        return ser.create(data);
    }
    
    @GetMapping ("/get")
    //http://localhost:8080/Product/get
    public List<ProductModel> getData()
    {
        return ser.getData();
    }
    @PutMapping("/update/{id}")
    //http://localhost:8080/Product/update
    public ProductModel update(@PathVariable Long id,@RequestBody ProductModel data)
    {
        return ser.update(id,data);
    }
    @DeleteMapping("/delete/{id}")
    //http://localhost:8080/Product/delete
    public String delete(@PathVariable Long id)
    {
        ser.delete(id);
        return "Product data deleted";
    }
}
