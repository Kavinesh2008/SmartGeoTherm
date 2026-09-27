package com.example.geotherm.service;

import com.example.geotherm.model.PurchaseModel;
import java.util.*;

public interface PurchaseService {
    public PurchaseModel create(PurchaseModel data);
    public List<PurchaseModel> getData();
    public PurchaseModel update(Long id,PurchaseModel data);
    public void delete(Long id);
}
