package com.example.jpa.services;

import com.example.jpa.models.Instrument;

import java.util.List;

public interface InstrumentService {
    List<Instrument> getAllInstruments();
    Instrument findInstrumentById(Long id);
    Instrument createInstrument (Instrument instrument);
   void updateInstrumentStock(Long id, Integer quantity);
}
