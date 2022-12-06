/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repositories;

import com.entity.PatientVitalEntity;
 import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientVitalRepository extends JpaRepository<PatientVitalEntity, Integer> {

    @Query(value = "select ic from PatientVitalEntity ic where ic.id=:id")
    public PatientVitalEntity finddetailById(@Param("id") int id);

}
