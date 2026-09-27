package com.example.geotherm.service;

import org.springframework.stereotype.Service;

import com.example.geotherm.model.ContactModel;
import com.example.geotherm.repository.ContactRepo;
import java.util.*;

@Service 
public class ContactServiceImpl implements ContactService{
    private final ContactRepo repo;
    public ContactServiceImpl(ContactRepo repo)
    {
        this.repo = repo;
    }
    @Override 
    public ContactModel create(ContactModel data)
    {
        return repo.save(data);
    }
    @Override 
    public List<ContactModel> getData()
    {
        return repo.findAll();
    }
    @Override 
    public ContactModel update(Long id,ContactModel data)
    {
        ContactModel exContact = repo.findById(id).orElse(null);
        if(exContact == null)
            return null;
        exContact.setName(data.getName());
        exContact.setType(data.getType());
        exContact.setAddress(data.getAddress());
        exContact.setPhone(data.getPhone());
        exContact.setEmail(data.getEmail());
        exContact.setStatus(data.getStatus());
        return repo.save(exContact);
    }
    @Override 
    public void delete(Long id)
    {
        repo.deleteById(id);
    }
}
