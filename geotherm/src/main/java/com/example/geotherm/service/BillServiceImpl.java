package com.example.geotherm.service;

import org.springframework.stereotype.Service;

import com.example.geotherm.model.BillModel;
import com.example.geotherm.repository.BillRepo;
import java.util.*;

@Service 
public class BillServiceImpl implements BillService {
    private final BillRepo repo;
    public BillServiceImpl(BillRepo repo){
        this.repo=repo;
    }
    @Override 
    public BillModel create(BillModel data)
    {
        return repo.save(data);
    }
    @Override 
    public List<BillModel> getData()
    {
        return repo.findAll();
    }
    @Override
    public BillModel update(Long id,BillModel data)
    {
        BillModel exBill = repo.findById(id).orElse(null);
        if(exBill==null)
            return null;
        exBill.setPurchase(data.getPurchase());
        exBill.setVendor(data.getVendor());
        exBill.setBill_number(data.getBill_number());
        exBill.setBill_date(data.getBill_date());
        exBill.setDue_date(data.getDue_date());
        exBill.setTotal_amount(data.getTotal_amount());
        exBill.setPaid_amount(data.getPaid_amount());
        exBill.setStatus(data.getStatus());
        exBill.setDescription(data.getDescription());
        return repo.save(exBill);
    }
    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
