package com.example.geotherm.service;

import com.example.geotherm.model.BudgetModel;
import java.util.*;

public interface BudgetService {
    public BudgetModel create(BudgetModel data);
    public List<BudgetModel> getData();
    public BudgetModel update(Long id,BudgetModel data);
    public void delete(Long id);
}
