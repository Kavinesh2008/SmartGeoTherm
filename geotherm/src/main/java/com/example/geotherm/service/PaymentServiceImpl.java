package com.example.geotherm.service;

import org.springframework.stereotype.Service;

import com.example.geotherm.model.PaymentModel;
import com.example.geotherm.repository.PaymentRepo;
import java.util.*;

@Service 
public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepo repo;
    public PaymentServiceImpl(PaymentRepo repo){
        this.repo = repo;
    }
    @Override 
    public PaymentModel create(PaymentModel data){
        return repo.save(data);
    }
    @Override 
    public List<PaymentModel> getData(){
        return repo.findAll();
    }
    @Override 
    public PaymentModel update(Long id,PaymentModel data){
        PaymentModel exPayment = repo.findById(id).orElse(null);
        if(exPayment == null)
            return null;
        exPayment.setPayment_number(data.getPayment_number());
        exPayment.setPayment_date(data.getPayment_date());
        exPayment.setPayment_type(data.getPayment_type());
        exPayment.setAmount(data.getAmount());
        exPayment.setPayment_method(data.getPayment_method());
        exPayment.setStatus(data.getStatus());
        exPayment.setDescription(data.getDescription());
        return repo.save(exPayment);
    }
    @Override 
    public void delete(Long id)
    {
        repo.deleteById(id);
    }
}
