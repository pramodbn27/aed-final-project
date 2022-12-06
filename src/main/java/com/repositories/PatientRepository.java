/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repositories;

import com.entity.PatientEntity;
 import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Integer> {

   @Query(value = "SELECT MAX(id) FROM Patient_Entity", nativeQuery = true)
    public  Integer  getLastId();

    @Query(value = "select ic from PatientEntity ic where ic.id=:id")
    public PatientEntity finddetailById(@Param("id") Integer id);
}
