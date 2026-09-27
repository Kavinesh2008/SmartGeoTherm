package com.example.geotherm.service;

import com.example.geotherm.model.TransferModel;
import java.util.*;

public interface TransferService {
    public TransferModel create(TransferModel data);
    public List<TransferModel> getData();
    public TransferModel update(Long id,TransferModel data);
    public void delete(Long id);
}
