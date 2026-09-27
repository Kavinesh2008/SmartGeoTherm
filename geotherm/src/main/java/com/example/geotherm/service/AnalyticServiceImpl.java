package com.example.geotherm.service;

import org.springframework.stereotype.Service;

import com.example.geotherm.model.AnalyticModel;
import com.example.geotherm.repository.AnalyticRepo;
import java.util.List;

@Service 
public class AnalyticServiceImpl implements AnalyticService {
    private final AnalyticRepo repo;
    public AnalyticServiceImpl(AnalyticRepo repo)
    {
        this.repo = repo;
    }
    @Override 
    public AnalyticModel create(AnalyticModel data)
    {
        return repo.save(data);
    }
    @Override 
    public List<AnalyticModel> getData()
    {
        return repo.findAll();
    }
    @Override 
    public AnalyticModel update(Long id,AnalyticModel data)
    {
        AnalyticModel exAnalytics = repo.findById(id).orElse(null);
        if(exAnalytics==null)
            return null;
        exAnalytics.setAnalytic_name(data.getAnalytic_name());
        exAnalytics.setAnalytic_code(data.getAnalytic_code());
        exAnalytics.setRevenue(data.getRevenue());
        exAnalytics.setExpenses(data.getExpenses());
        exAnalytics.setDescription(data.getDescription());
        return repo.save(exAnalytics);
    }
    @Override 
    public void delete(Long id)
    {
        repo.deleteById(id);
    }
}
