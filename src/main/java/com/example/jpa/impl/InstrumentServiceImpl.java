package com.example.jpa.impl;

import com.example.jpa.models.Instrument;
import com.example.jpa.repositories.InstrumentRepository;
import com.example.jpa.services.InstrumentService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstrumentServiceImpl implements InstrumentService {

    private final InstrumentRepository instrumentRepository;
    @Autowired
    public InstrumentServiceImpl(InstrumentRepository instrumentRepository){
        this.instrumentRepository = instrumentRepository;
    }

    public List<Instrument> getAllInstruments(){
        return instrumentRepository.findAll();
    }
    public Instrument findInstrumentById(Long id){
        return instrumentRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Instrument not found"));


    }
    public Instrument createInstrument (Instrument instrument){
    if(instrument.getStockQuantity()< 0){
        throw new IllegalArgumentException("sTOCK QUANTITI CANNOT BE NEGATIEVE");
    }
        return instrumentRepository.save(instrument);
    }
    public void updateInstrumentStock(Long id, Integer quantity){
        Instrument instrument = findInstrumentById(id);
        if (instrument == null){
            throw new EntityNotFoundException("Instrument with id: " + id + "cannot be found!");


        }


    }

}
