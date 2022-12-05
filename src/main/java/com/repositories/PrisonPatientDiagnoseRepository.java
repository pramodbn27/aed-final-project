/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repositories;

import com.entity.PrisonPatientDiagnoseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface PrisonPatientDiagnoseRepository extends JpaRepository<PrisonPatientDiagnoseEntity, Integer> {

    @Query(value = "select ic from PrisonPatientDiagnoseEntity ic where ic.id=:id")
    public PrisonPatientDiagnoseEntity finddetailById(@Param("id") int patientId);

}
