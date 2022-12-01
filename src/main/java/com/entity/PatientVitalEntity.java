/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "PatientVitalEntity")
@Data
@NoArgsConstructor
public class PatientVitalEntity implements Serializable {

    private static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Column(name = "bp")
    private double bp;  // change it to double

    @Column(name = "weight")
    private int weight; // change it to Int

    @Column(name = "phq")
    private int phq; //change it to phq

    @Column(name = "gad")
    private int gad; //change it to gad

    @Column(name = "patientId")
    private int patientId; // change 

    @Column(name = "state")
    private String state; 

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the bp
     */
    public double getBp() {
        return bp;
    }

    /**
     * @param bp the bp to set
     */
    public void setBp(double bp) {
        this.bp = bp;
    }

  

    /**
     * @return the patientId
     */
    public int getPatientId() {
        return patientId;
    }

    /**
     * @param patientId the patientId to set
     */
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the phq
     */
    public int getPhq() {
        return phq;
    }

    /**
     * @param phq the phq to set
     */
    public void setPhq(int phq) {
        this.phq = phq;
    }

    /**
     * @return the gad
     */
    public int getGad() {
        return gad;
    }

    /**
     * @param gad the gad to set
     */
    public void setGad(int gad) {
        this.gad = gad;
    }

}
