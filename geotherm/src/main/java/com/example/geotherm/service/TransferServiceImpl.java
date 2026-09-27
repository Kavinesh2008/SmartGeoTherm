package com.example.geotherm.service;

import org.springframework.stereotype.Service;

import com.example.geotherm.model.TransferModel;
import com.example.geotherm.repository.TransferRepo;
import java.util.*;

@Service 
public class TransferServiceImpl implements TransferService{
    private final TransferRepo repo;
    public TransferServiceImpl(TransferRepo repo)
    {
        this.repo=repo;
    }
    @Override 
    public TransferModel create(TransferModel data)
    {
        return repo.save(data);
    }
    @Override 
    public List<TransferModel> getData()
    {
        return repo.findAll();
    }
    @Override 
    public TransferModel update(Long id,TransferModel data)
    {
        TransferModel exTranfer = repo.findById(id).orElse(null);
        if(exTranfer==null)
            return null;
        exTranfer.setWell(data.getWell());
        exTranfer.setContact(data.getContact());
        exTranfer.setEnergy_gj(data.getEnergy_gj());
        exTranfer.setTransfer_date(data.getTransfer_date());
        exTranfer.setTransfer_temperature(data.getTransfer_temperature());
        exTranfer.setStatus(data.getStatus());
        return repo.save(exTranfer);
    }
    @Override 
    public void delete(Long id)
    {
        repo.deleteById(id);
    }
}

