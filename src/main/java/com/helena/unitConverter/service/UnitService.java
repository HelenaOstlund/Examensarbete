package com.helena.unitConverter.service;

import com.helena.unitConverter.entity.Unit;
import com.helena.unitConverter.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UnitService {

    private UnitRepository unitRepository;

    @Autowired
    public UnitService(UnitRepository unitRepository){
        this.unitRepository = unitRepository;
    }
    public ResponseEntity<List<Unit>> getAllUnits() {
        try {
            List<Unit> units = new ArrayList<>();
            unitRepository.findAll().forEach(units::add);
            if (units.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(units, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
