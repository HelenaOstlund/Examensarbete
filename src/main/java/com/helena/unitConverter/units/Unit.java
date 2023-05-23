package com.helena.unitConverter.units;

import jakarta.persistence.*;

@Entity
@Table(name = "units")
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "unit_name")
    private String unitName;

    @Column(name = "unit_type")
    private String unitType;

    @Column(name = "conversion_rate")
    private double conversionRate;

    public Unit(){}

    public Unit(Long id, String unitName, String unitType, double conversionRate) {
        this.id = id;
        this.unitName = unitName;
        this.unitType = unitType;
        this.conversionRate = conversionRate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }


}
