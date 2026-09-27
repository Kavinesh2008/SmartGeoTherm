package com.example.geotherm.service;

import com.example.geotherm.model.ContactModel;
import java.util.*;

public interface ContactService {
    public ContactModel create(ContactModel data);
    public List<ContactModel> getData();
    public ContactModel update(Long id,ContactModel data);
    public void delete(Long id);
}
