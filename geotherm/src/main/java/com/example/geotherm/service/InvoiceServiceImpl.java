
package com.example.geotherm.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.geotherm.model.InvoiceModel;
import com.example.geotherm.repository.InvoiceRepo;


@Service
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepo repo;

    public InvoiceServiceImpl(InvoiceRepo repo) {
        this.repo = repo;
    }

    @Override
    public InvoiceModel create(InvoiceModel data) {
        return repo.save(data);
    }

    @Override
    public List<InvoiceModel> getData() {
        return repo.findAll();
    }

    @Override
    public InvoiceModel update(Long id, InvoiceModel data) {

        InvoiceModel exInvoice = repo.findById(id).orElse(null);

        if (exInvoice == null) {
            return null;
        }

        exInvoice.setSales(data.getSales());
        exInvoice.setCustomer(data.getCustomer());
        exInvoice.setInvoice_number(data.getInvoice_number());
        exInvoice.setInvoice_date(data.getInvoice_date());
        exInvoice.setDue_date(data.getDue_date());
        exInvoice.setEnergy_gj(data.getEnergy_gj());
        exInvoice.setUnit_price(data.getUnit_price());
        exInvoice.setTotal_amount(data.getTotal_amount());
        exInvoice.setPaid_amount(data.getPaid_amount());
        exInvoice.setStatus(data.getStatus());
        exInvoice.setDescription(data.getDescription());

        return repo.save(exInvoice);
    }

    @Override
    public void delete(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        }
    }
}