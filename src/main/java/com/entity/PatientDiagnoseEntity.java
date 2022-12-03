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
@Table(name = "PatientDiagnoseEntity")
@Data
@NoArgsConstructor
public class PatientDiagnoseEntity implements Serializable {

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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the drname
     */
    public String getDrname() {
        return drname;
    }

    /**
     * @param drname the drname to set
     */
    public void setDrname(String drname) {
        this.drname = drname;
    }

    /**
     * @return the caseSer
     */
    public String getCaseSer() {
        return caseSer;
    }

    /**
     * @param caseSer the caseSer to set
     */
    public void setCaseSer(String caseSer) {
        this.caseSer = caseSer;
    }

    /**
     * @return the issueType
     */
    public String getIssueType() {
        return issueType;
    }

    /**
     * @param issueType the issueType to set
     */
    public void setIssueType(String issueType) {
        this.issueType = issueType;
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
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @return the setRehab
     */
    public String getSetRehab() {
        return setRehab;
    }

    /**
     * @param setRehab the setRehab to set
     */
    public void setSetRehab(String setRehab) {
        this.setRehab = setRehab;
    }

    /**
     * @return the prescription
     */
    public String getPrescription() {
        return prescription;
    }

    /**
     * @param prescription the prescription to set
     */
    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    private static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "drname")
    private String drname;

    @Column(name = "caseSer")
    private String caseSer;

    @Column(name = "issueType")
    private String issueType;

    @Column(name = "patientId")
    private int patientId;

    @Column(name = "comments")
    private String comments;

    @Column(name = "setRehab")
    private String setRehab;

    @Column(name = "prescription")
    private String prescription;

}
