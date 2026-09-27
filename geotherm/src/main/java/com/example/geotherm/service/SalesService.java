package com.example.geotherm.service;

import com.example.geotherm.model.SalesModel;
import java.util.*;

public interface SalesService {

    public SalesModel create(SalesModel data);
    public List<SalesModel> getData();
    public SalesModel update(Long id,SalesModel data);
    public void delete(Long id);
}
