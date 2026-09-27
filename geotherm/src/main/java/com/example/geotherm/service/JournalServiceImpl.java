package com.example.geotherm.service;

import org.springframework.stereotype.Service;

import com.example.geotherm.model.JournalModel;
import com.example.geotherm.repository.JournalRepo;
import java.util.*;

@Service 
public class JournalServiceImpl implements JournalService{

    private final JournalRepo repo;
    public JournalServiceImpl(JournalRepo repo) {
        this.repo = repo;
    }
    @Override 
    public JournalModel create(JournalModel data)
    {
        return repo.save(data);
    }
    @Override
    public List<JournalModel> getData()
    {
        return repo.findAll();
    }
    @Override 
    public JournalModel update(Long id,JournalModel data)
    {
        JournalModel exJournal = repo.findById(id).orElse(null);
        if(exJournal==null)
            return null;
        exJournal.setJournal_code(data.getJournal_code());
        exJournal.setJournal_name(data.getJournal_name());
        exJournal.setJournal_type(data.getJournal_type());
        exJournal.setDescription(data.getDescription());
        exJournal.setStatus(data.getStatus());
        return repo.save(exJournal);
    }
    @Override 
    public void delete(Long id)
    {
        repo.deleteById(id);
    }
}
