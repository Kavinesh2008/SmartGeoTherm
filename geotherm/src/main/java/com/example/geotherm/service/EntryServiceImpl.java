package com.example.geotherm.service;

import org.springframework.stereotype.Service;

import com.example.geotherm.model.EntryModel;
import com.example.geotherm.repository.EntryRepo;
import java.util.List;

@Service 
public class EntryServiceImpl implements EntryService{
    private final EntryRepo repo;
    public EntryServiceImpl(EntryRepo repo) {
        this.repo = repo;
    }
    @Override 
    public EntryModel create(EntryModel data)
    {
        return repo.save(data);
    }
    @Override 
    public List<EntryModel> getData()
    {
        return repo.findAll();
    }
    @Override 
    public EntryModel update(Long id,EntryModel data)
    {
        EntryModel exEntry = repo.findById(id).orElse(null);
        if(exEntry==null)
            return null;
        exEntry.setEntry_date(data.getEntry_date());
        exEntry.setJournal(data.getJournal());
        exEntry.setAccount(data.getAccount());
        exEntry.setDescription(data.getDescription());
        exEntry.setDebit(data.getDebit());
        exEntry.setCredit(data.getCredit());
        exEntry.setReference_no(data.getReference_no());
        return repo.save(exEntry);
    }
    @Override
    public void delete(Long id)
    {
        repo.deleteById(id);
    }
}
