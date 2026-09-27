package com.example.geotherm.service;

import com.example.geotherm.model.AccountModel;
import java.util.*;

public interface AccountService {
    public AccountModel create(AccountModel data);
    public List<AccountModel> getData();
    public AccountModel update(Long id,AccountModel data);
    public void delete(Long id);
}
