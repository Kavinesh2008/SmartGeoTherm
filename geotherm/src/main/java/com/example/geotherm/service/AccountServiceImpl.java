package com.example.geotherm.service;

import org.springframework.stereotype.Service;

import com.example.geotherm.model.AccountModel;
import com.example.geotherm.repository.AccountRepo;
import java.util.*;

@Service 
public class AccountServiceImpl implements AccountService{
    private final AccountRepo repo;
    public AccountServiceImpl(AccountRepo repo)
    {
        this.repo = repo;
    }
    @Override 
    public AccountModel create(AccountModel data)
    {
        return repo.save(data);
    }
    @Override 
    public List<AccountModel> getData()
    {
        return repo.findAll();
    }
    @Override 
    public AccountModel update(Long id,AccountModel data)
    {
        AccountModel exAccount = repo.findById(id).orElse(null);
        if(exAccount==null)
            return null;
        exAccount.setAccount_code(data.getAccount_code());
        exAccount.setAccount_name(data.getAccount_name());
        exAccount.setAccount_type(data.getAccount_type());
        exAccount.setDescription(data.getDescription());
        exAccount.setStatus(data.getStatus());
        return repo.save(exAccount);
    }
    @Override 
    public void delete(Long id)
    {
        repo.deleteById(id);
    }
}
