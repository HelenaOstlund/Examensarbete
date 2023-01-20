package com.helena.unitConverter.repository;

import com.helena.unitConverter.entity.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends JpaRepository <Unit, Long>{

}
