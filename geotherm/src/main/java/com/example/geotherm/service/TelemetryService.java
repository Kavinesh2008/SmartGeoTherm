package com.example.geotherm.service;

import com.example.geotherm.model.TelemetryModel;
import java.util.List;

public interface TelemetryService {

    public TelemetryModel create(TelemetryModel data);
    public List<TelemetryModel> getData();
    public TelemetryModel update(Long id,TelemetryModel data);
    public void delete(Long id);
}
