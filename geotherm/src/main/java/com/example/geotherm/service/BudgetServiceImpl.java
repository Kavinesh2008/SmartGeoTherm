package com.example.geotherm.service;

import org.springframework.stereotype.Service;

import com.example.geotherm.model.BudgetModel;
import com.example.geotherm.repository.BudgetRepo;
import java.util.List;

@Service 
public class BudgetServiceImpl implements BudgetService{
    private final BudgetRepo repo;
    public BudgetServiceImpl(BudgetRepo repo){
        this.repo = repo;
    }
    @Override 
    public BudgetModel create(BudgetModel data){
        return repo.save(data);
    }
    @Override 
    public List<BudgetModel> getData(){
        return repo.findAll();
    }
    @Override 
    public BudgetModel update(Long id,BudgetModel data){
        BudgetModel existingData = repo.findById(id).orElseThrow(()->new RuntimeException("Data not found"));
        existingData.setBudget_name(data.getBudget_name());
        existingData.setBudget_code(data.getBudget_code());
        existingData.setBudget_year(data.getBudget_year());
        existingData.setPlanned_expenses(data.getPlanned_expenses());
        existingData.setActual_expenses(data.getActual_expenses());
        existingData.setPlanned_revenue(data.getPlanned_revenue());
        existingData.setActual_revenue(data.getActual_revenue());
        existingData.setStatus(data.getStatus());
        existingData.setDescription(data.getDescription());
        return repo.save(existingData);
    }
    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
