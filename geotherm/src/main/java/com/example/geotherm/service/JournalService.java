package com.example.geotherm.service;

import com.example.geotherm.model.JournalModel;
import java.util.List;

public interface JournalService {
    public JournalModel create(JournalModel data);
    public List<JournalModel> getData();
    public JournalModel update(Long id,JournalModel data);
    public void delete(Long id);
}
