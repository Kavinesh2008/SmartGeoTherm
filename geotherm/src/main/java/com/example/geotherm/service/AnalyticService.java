package com.example.geotherm.service;

import com.example.geotherm.model.AnalyticModel;
import java.util.*;

public interface AnalyticService {
    public AnalyticModel create(AnalyticModel data);
    public List<AnalyticModel> getData();
    public AnalyticModel update(Long id,AnalyticModel data);
    public void delete(Long id);
}
