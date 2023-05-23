package com.helena.unitConverter.units;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UnitRepository extends JpaRepository <Unit, Long>{

    @Query("SELECT u FROM Unit u WHERE u.unitName = ?1")
    Optional<Unit> existsByName(String unitName);

}
