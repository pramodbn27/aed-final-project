/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repositories;

import com.entity.PrisonPatientVitalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface PrisonPatientVitalRepository extends JpaRepository<PrisonPatientVitalEntity, Integer> {

    @Query(value = "select ic from PrisonPatientVitalEntity ic where ic.patientId=:patientId")
    public PrisonPatientVitalEntity finddetailById(@Param("patientId") int patientId);

}
