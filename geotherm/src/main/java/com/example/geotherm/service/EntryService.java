package com.example.geotherm.service;

import com.example.geotherm.model.EntryModel;
import java.util.*;

public interface EntryService {
    public EntryModel create(EntryModel data);
    public List<EntryModel> getData();
    public EntryModel update(Long id,EntryModel data);
    public void delete(Long id);
}
