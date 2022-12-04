/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patientEnterPriseAdmin;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

/**
 *
 * @author ajitpatil
 */
@Controller(value = "PatientAdminReg")
public class PatientAdminReg extends javax.swing.JPanel {

    /**
     * Creates new form PatientAdminReg
     */
    public PatientAdminReg( ApplicationContext applicationContext) {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientIdTxt = new javax.swing.JTextField();
        patientNameTxt = new javax.swing.JTextField();
        patientAgeTxt = new javax.swing.JTextField();
        patientGenderCombo = new javax.swing.JComboBox<>();
        patientZipcodeTxt = new javax.swing.JTextField();
        patientAddressTxt = new javax.swing.JTextField();
        patientCityTxt = new javax.swing.JTextField();
        patientStateTxt = new javax.swing.JTextField();
        patientIdLb = new javax.swing.JLabel();
        patientNameLb = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        patientGenderLb = new javax.swing.JLabel();
        patientAddressLb = new javax.swing.JLabel();
        patientCityLb = new javax.swing.JLabel();
        patientStateLb = new javax.swing.JLabel();
        patientZipcodeLb = new javax.swing.JLabel();
        concernLb = new javax.swing.JLabel();
        SaveBtn = new javax.swing.JButton();
        mainImage1 = new javax.swing.JLabel();

        patientIdLb.setText("Patient Id");

        patientNameLb.setText("Name");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setText(" Age");

        patientGenderLb.setText("Gender");

        patientAddressLb.setText("Address");

        patientCityLb.setText("City");

        patientStateLb.setText("State");

        patientZipcodeLb.setText("Zipcode");

        concernLb.setText("Concern");

        SaveBtn.setText("Save");

        mainImage1.setBackground(new java.awt.Color(41, 46, 64));
        mainImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/Mentally Healthy Communities .jpg"))); // NOI18N
        mainImage1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 170, 170), 2));
        mainImage1.setMaximumSize(new java.awt.Dimension(728, 410));
        mainImage1.setMinimumSize(new java.awt.Dimension(728, 410));
        mainImage1.setOpaque(true);
        mainImage1.setPreferredSize(new java.awt.Dimension(728, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(patientIdLb)
                .addGap(235, 235, 235)
                .addComponent(patientCityLb))
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(patientAgeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(patientAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(535, 535, 535)
                .addComponent(patientCityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(patientAddressLb))
            .addGroup(layout.createSequentialGroup()
                .addGap(491, 491, 491)
                .addComponent(patientStateLb))
            .addGroup(layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(patientNameLb))
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(patientZipcodeLb))
            .addGroup(layout.createSequentialGroup()
                .addGap(535, 535, 535)
                .addComponent(patientZipcodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(535, 535, 535)
                .addComponent(patientStateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(patientIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(patientGenderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(patientGenderLb))
            .addGroup(layout.createSequentialGroup()
                .addGap(415, 415, 415)
                .addComponent(SaveBtn))
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(patientNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(477, 477, 477)
                .addComponent(concernLb))
            .addComponent(mainImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientIdLb)
                    .addComponent(patientCityLb))
                .addGap(94, 94, 94)
                .addComponent(patientAgeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(patientAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(patientCityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(patientAddressLb))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(patientStateLb))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(patientNameLb))
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(patientZipcodeLb))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(patientZipcodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(patientStateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(patientIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(patientGenderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(patientGenderLb))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(SaveBtn))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(patientNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(concernLb))
            .addComponent(mainImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel concernLb;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel mainImage1;
    private javax.swing.JLabel patientAddressLb;
    private javax.swing.JTextField patientAddressTxt;
    private javax.swing.JTextField patientAgeTxt;
    private javax.swing.JLabel patientCityLb;
    private javax.swing.JTextField patientCityTxt;
    private javax.swing.JComboBox<String> patientGenderCombo;
    private javax.swing.JLabel patientGenderLb;
    private javax.swing.JLabel patientIdLb;
    private javax.swing.JTextField patientIdTxt;
    private javax.swing.JLabel patientNameLb;
    private javax.swing.JTextField patientNameTxt;
    private javax.swing.JLabel patientStateLb;
    private javax.swing.JTextField patientStateTxt;
    private javax.swing.JLabel patientZipcodeLb;
    private javax.swing.JTextField patientZipcodeTxt;
    // End of variables declaration//GEN-END:variables
}