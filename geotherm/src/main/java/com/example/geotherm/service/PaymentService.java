package com.example.geotherm.service;

import com.example.geotherm.model.PaymentModel;
import java.util.List;

public interface PaymentService {
    public PaymentModel create(PaymentModel data);
    public List<PaymentModel> getData();
    public PaymentModel update(Long id, PaymentModel data);
    public void delete(Long id);
}
