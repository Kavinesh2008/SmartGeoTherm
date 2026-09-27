package com.example.geotherm.service;

import org.springframework.stereotype.Service;

import com.example.geotherm.model.WellModel;
import com.example.geotherm.repository.WellRepo;
import java.util.*;

@Service 
public class WellServiceImpl implements WellService{
    private final WellRepo repo;

    public WellServiceImpl(WellRepo repo)
    {
        this.repo = repo;
    }

    @Override 
    public WellModel create(WellModel data)
    {
        return repo.save(data);
    }
    @Override 
    public List<WellModel> getData()
    {
        return repo.findAll();
    }
    @Override 
    public WellModel update(Long id,WellModel data)
    {
        WellModel exWell = repo.findById(id).orElse(null);
        if(exWell==null)
            return null;
        exWell.setWell_name(data.getWell_name());
        exWell.setLocation(data.getLocation());
        exWell.setTemperature(data.getTemperature());
        exWell.setPressure(data.getPressure());
        exWell.setFlow_rate(data.getFlow_rate());
        exWell.setThermal_efficiency(data.getThermal_efficiency());
        exWell.setStatus(data.getStatus());
        exWell.setInstalled_date(data.getInstalled_date());
        return repo.save(exWell);
    }
    @Override 
    public void delete(Long id)
    {
        repo.deleteById(id);
    }
}
