package com.example.geotherm.service;

import org.springframework.stereotype.Service;

import com.example.geotherm.model.TelemetryModel;
import com.example.geotherm.repository.TelemetryRepo;
import java.util.*;

@Service 

public class TelemetryServiceImpl implements TelemetryService{
    private final TelemetryRepo repo;
    
    public TelemetryServiceImpl(TelemetryRepo repo)
    {
        this.repo = repo;
    }

    @Override 
    public TelemetryModel create(TelemetryModel data)
    {
        return repo.save(data);
    }
    @Override 
    public List<TelemetryModel> getData()
    {
        return repo.findAll();
    }
    @Override 
    public TelemetryModel update(Long id,TelemetryModel data)
    {
        TelemetryModel exTele = repo.findById(id).orElse(null);
        if(exTele == null)
                return null;
        exTele.setWell(data.getWell());
        exTele.setTemperature(data.getTemperature());
        exTele.setPressure(data.getPressure());
        exTele.setFlow_rate(data.getFlow_rate());
        exTele.setHeat_output(data.getHeat_output());
        exTele.setPressure_status(data.getPressure_status());
        exTele.setRecorded_at(data.getRecorded_at());
        return repo.save(exTele);
    }
    @Override 
    public void delete(Long id)
    {
        repo.deleteById(id);
    }
}
