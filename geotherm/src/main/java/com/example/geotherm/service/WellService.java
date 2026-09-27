package com.example.geotherm.service;

import com.example.geotherm.model.WellModel;
import java.util.*;

public interface WellService {
    public WellModel create(WellModel data);
    public List<WellModel> getData();
    public WellModel update(Long id,WellModel data);
    public void delete(Long id);
}
