package com.example.geotherm.service;

import org.springframework.stereotype.Service;

import com.example.geotherm.model.ProductModel;
import com.example.geotherm.repository.ProductRepo;
import java.util.*;

@Service 
public class ProductServiceImpl implements ProductService{
    private final ProductRepo repo;
    public ProductServiceImpl(ProductRepo repo)
    {
        this.repo = repo;
    }
    @Override 
    public ProductModel create(ProductModel data)
    {
        return repo.save(data);
    }
    @Override 
    public List<ProductModel> getData()
    {
        return repo.findAll();
    }
    @Override 
    public ProductModel update(Long id,ProductModel data)
    {
       ProductModel exProduct = repo.findById(id).orElse(null);
       if(exProduct==null)
        return null;
       exProduct.setName(data.getName());
       exProduct.setType(data.getType());
       exProduct.setUnit(data.getUnit());
       exProduct.setPrice(data.getPrice());
       exProduct.setStatus(data.getStatus());
       return repo.save(exProduct);
    }
    @Override 
    public void delete(Long id)
    {
        repo.deleteById(id);
    }
}
