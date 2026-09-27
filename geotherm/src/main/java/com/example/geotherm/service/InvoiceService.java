package com.example.geotherm.service;

import com.example.geotherm.model.InvoiceModel;
import java.util.*;

public interface InvoiceService {
    public InvoiceModel create(InvoiceModel data);
    public List<InvoiceModel> getData();
    public InvoiceModel update(Long id,InvoiceModel data);
    public void delete(Long id);
}
