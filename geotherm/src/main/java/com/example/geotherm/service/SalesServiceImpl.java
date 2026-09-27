package com.example.geotherm.service;

import org.springframework.stereotype.Service;

import com.example.geotherm.model.SalesModel;
import com.example.geotherm.repository.SalesRepo;
import java.util.*;

@Service 
public class SalesServiceImpl implements SalesService{
    private final SalesRepo repo;
    public SalesServiceImpl(SalesRepo repo)
    {
        this.repo = repo;
    }
    @Override 
    public SalesModel create(SalesModel data)
    {
        return repo.save(data);
    }
    @Override 
    public List<SalesModel> getData()
    {
        return repo.findAll();
    }
    @Override
    public SalesModel update(Long id,SalesModel data)
    {
        SalesModel exSales = repo.findById(id).orElse(null);
        if(exSales==null)
            return null;
        exSales.setCustomer(data.getCustomer());
        exSales.setProduct(data.getProduct());
        exSales.setOrder_number(data.getOrder_number());
        exSales.setOrder_date(data.getOrder_date());
        exSales.setQuantity(data.getQuantity());
        exSales.setUnit_price(data.getUnit_price());
        exSales.setTotal_amount(data.getTotal_amount());
        exSales.setStatus(data.getStatus());
        exSales.setDescription(data.getDescription());
        return repo.save(exSales);
    }
    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
