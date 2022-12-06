/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repositories;

import com.entity.PatientDiagnoseEntity;
import com.entity.PatientEntity;
import com.entity.PatientVitalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientDiagnoseRepository extends JpaRepository<PatientDiagnoseEntity, Integer> {

    @Query(value = "select ic from PatientDiagnoseEntity ic where ic.id=:id")
    public PatientDiagnoseEntity finddetailById(@Param("id") int id);

}
