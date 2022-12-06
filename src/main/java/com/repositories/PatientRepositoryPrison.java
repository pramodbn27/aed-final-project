/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repositories;

import com.entity.PrisonPatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepositoryPrison extends JpaRepository<PrisonPatientEntity, Integer> {

    @Query(value = "select ic from PrisonPatientEntity ic where ic.id=:id")
    public PrisonPatientEntity finddetailById(@Param("id") Integer id);

}
