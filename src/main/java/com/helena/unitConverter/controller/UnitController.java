package com.helena.unitConverter.controller;

import com.helena.unitConverter.entity.Unit;
import com.helena.unitConverter.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/units")
public class UnitController {

    private UnitService unitService;

    @Autowired
    public UnitController(UnitService unitService){
        this.unitService = unitService;
    }

    @GetMapping("/getAllUnits")
    public ResponseEntity<List<Unit>>getAllUnits(){
        return unitService.getAllUnits();
    }

}
