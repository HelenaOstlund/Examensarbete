package com.helena.unitConverter.controller;

import com.helena.unitConverter.entity.Unit;
import com.helena.unitConverter.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/getUnitById/{id}")
    public ResponseEntity<Unit> getIdUnit (@PathVariable("id") Long id) {
        return unitService.getUnitById(id);
    }

    @PostMapping("/createUnit")
    public ResponseEntity<Unit> createUnit(@RequestBody Unit unit){
        return unitService.create(unit);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUnit(@PathVariable("id") Long id){
        unitService.deleteUnit(id);
    }
}
