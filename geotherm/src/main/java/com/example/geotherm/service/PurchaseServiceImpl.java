package com.example.geotherm.service;

import org.springframework.stereotype.Service;

import com.example.geotherm.model.PurchaseModel;
import com.example.geotherm.repository.PurchaseRepo;
import java.util.*;

@Service 
public class PurchaseServiceImpl implements PurchaseService{
    private final PurchaseRepo repo;
    public PurchaseServiceImpl(PurchaseRepo repo)
    {
        this.repo = repo;
    }
    @Override 
    public PurchaseModel create(PurchaseModel data)
    {
        return repo.save(data);
    }
    @Override 
    public List<PurchaseModel> getData()
    {
        return repo.findAll();
    }
    @Override
    public PurchaseModel update(Long id,PurchaseModel data)
    {
        PurchaseModel exPurchase = repo.findById(id).orElse(null);
        if(exPurchase==null)
            return null;
        exPurchase.setVendor(data.getVendor());
        exPurchase.setProduct(data.getProduct());
        exPurchase.setOrder_date(data.getOrder_date());
        exPurchase.setQuantity(data.getQuantity());
        exPurchase.setUnit_price(data.getUnit_price());
        exPurchase.setTotal_amount(data.getTotal_amount());
        exPurchase.setStatus(data.getStatus());
        exPurchase.setDescription(data.getDescription());
        return repo.save(exPurchase);
    }
    @Override 
    public void delete(Long id)
    {
        repo.deleteById(id);
    }
}
