package com.example.geotherm.service;

import com.example.geotherm.model.BillModel;
import java.util.*;

public interface BillService {
    public BillModel create(BillModel data);
    public List<BillModel> getData();
    public BillModel update(Long id,BillModel data);
    public void delete(Long id);
}
