/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repositories;

import com.entity.LoginDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface LoginDetailDetailRepository extends JpaRepository<LoginDetails, Integer> {

//queries added

    @Query(value = "SELECT ep FROM LoginDetails ep WHERE ep.id=:id")
    public LoginDetails getDetailById(@Param("id") Integer id);

    @Query(value = "SELECT ep FROM LoginDetails ep WHERE ep.username=:username")
    public LoginDetails getDetailById(@Param("username") String username);
}
