/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import com.entity.LoginDetails;
import com.hospitalEnterpriseAdmin.HospitalAdminJFrame;
import com.justiceEntAdmin.JusticeEntAdminJFrame;
import com.patientEnterPriseAdmin.PatientEnterpriseAdminJFrame;
import com.repositories.LoginDetailDetailRepository;
import static com.util.Constant.PATIENT;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

@Controller(value = "LoginPage")
public class LoginPage extends javax.swing.JFrame {

    PatientEnterpriseAdminJFrame enterpriseAdminJFrame;
    HospitalAdminJFrame hospitalAdminJFrame;
    SystemAdminJFrame mainAdmin;
    PharmacyPage pharmacyPage;
    RehabPage rehabPage;
    LegalAdvisorPage legalAdvisorPage;
    PolicePage policePage;
    PsychWardPage psychWardPage;
    DoctorPage doctorPage;
    Prisinorpage prisinorpage;
    CounselorPage counselorPage;
    PatiendRegistration patiendRegistration;
    SignUp signUp;
    JusticeEntAdminJFrame justiceEntAdminJFrame;
    private LoginDetailDetailRepository loginDetailDetailRepository;

    /**
     * Creates new form Homepage
     */
    public LoginPage(PatientEnterpriseAdminJFrame enterpriseAdminJFrame,
            JusticeEntAdminJFrame justiceEntAdminJFrame, HospitalAdminJFrame hospitalAdminJFrame,
            SystemAdminJFrame mainAdmin,
            PharmacyPage pharmacyPage,
            RehabPage rehabPage,
            LegalAdvisorPage legalAdvisorPage,
            PolicePage policePage,
            PsychWardPage psychWardPage,
            DoctorPage doctorPage,
            Prisinorpage prisinorpage, CounselorPage counselorPage, PatiendRegistration patiendRegistration,
            SignUp signUp,
            LoginDetailDetailRepository loginDetailDetailRepository,
            ApplicationContext applicationContext) {
        this.enterpriseAdminJFrame = applicationContext.getBean(PatientEnterpriseAdminJFrame.class);
        this.justiceEntAdminJFrame = applicationContext.getBean(JusticeEntAdminJFrame.class);
        this.hospitalAdminJFrame = applicationContext.getBean(HospitalAdminJFrame.class);
        this.mainAdmin = applicationContext.getBean(SystemAdminJFrame.class);
        this.pharmacyPage = applicationContext.getBean(PharmacyPage.class);
        this.rehabPage = applicationContext.getBean(RehabPage.class);
        this.legalAdvisorPage = applicationContext.getBean(LegalAdvisorPage.class);
        this.policePage = applicationContext.getBean(PolicePage.class);
        this.psychWardPage = applicationContext.getBean(PsychWardPage.class);
        this.doctorPage = applicationContext.getBean(DoctorPage.class);
        this.prisinorpage = applicationContext.getBean(Prisinorpage.class);
        this.counselorPage = applicationContext.getBean(CounselorPage.class);
        this.patiendRegistration = applicationContext.getBean(PatiendRegistration.class);
        this.signUp = applicationContext.getBean(SignUp.class);
        this.loginDetailDetailRepository = applicationContext.getBean(LoginDetailDetailRepository.class);

        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TXTuSERnAME = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        mainImage1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(728, 410));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setMaximumSize(new java.awt.Dimension(728, 410));
        jPanel1.setMinimumSize(new java.awt.Dimension(728, 410));
        jPanel1.setPreferredSize(new java.awt.Dimension(728, 410));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, 40, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MENTAL HEALTH");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 280, -1));
        jPanel1.add(TXTuSERnAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 280, 40));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 280, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PASSWORD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 280, 20));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 280, 40));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setText("show password");
        jCheckBox1.setOpaque(false);
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 150, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("USER NAME");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 280, 20));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 153, 0));
        jButton2.setText("SIGNUP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 280, 40));

        mainImage1.setBackground(new java.awt.Color(41, 46, 64));
        mainImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/Mentally Healthy Communities .jpg"))); // NOI18N
        mainImage1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 170, 170), 2));
        mainImage1.setMaximumSize(new java.awt.Dimension(728, 410));
        mainImage1.setMinimumSize(new java.awt.Dimension(728, 410));
        mainImage1.setOpaque(true);
        mainImage1.setPreferredSize(new java.awt.Dimension(728, 410));
        jPanel1.add(mainImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if (evt.getStateChange() != ItemEvent.SELECTED) {
            txtPassword.setEchoChar('*');
        } else {
            txtPassword.setEchoChar((char) 0);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LoginDetails detailById = loginDetailDetailRepository.getDetailById(TXTuSERnAME.getText());
        if (null != detailById) {
            if (TXTuSERnAME.getText().equals(detailById.getName()) && txtPassword.getText().equals(detailById.getUserPassword())) {

                TXTuSERnAME.setText("");
                txtPassword.setText("");
                if (detailById.getRoleName().equals(PATIENT)) {
                    patiendRegistration.setVisible(true);
                }
                if (detailById.getRoleName().equals("COUNSELOR")) {
                    counselorPage.setVisible(true);
                }
                if (detailById.getRoleName().equals("DOCTOR")) {
                    doctorPage.setVisible(true);
                }
                if (detailById.getRoleName().equals("PHARMACY")) {
                    pharmacyPage.setVisible(true);
                }
                if (detailById.getRoleName().equals("REHAB")) {
                    rehabPage.setVisible(true);
                }
                if (detailById.getRoleName().equals("JAILADMIN")) {
                    prisinorpage.setVisible(true);
                }
                if (detailById.getRoleName().equals("LEGAL ADVISOR")) {
                    legalAdvisorPage.setVisible(true);
                }
                if (detailById.getRoleName().equals("POLICE")) {
                    policePage.setVisible(true);
                }
                if (detailById.getRoleName().equals("PSYCH WARD")) {
                    psychWardPage.setVisible(true);
                }

                if (detailById.getRoleName().equals("SYSTEMADMIN")) {
                    mainAdmin.setVisible(true);
                }

                if (detailById.getRoleName().equals("HOSPITALENTADMIN")) {
                    hospitalAdminJFrame.setVisible(true);
                }

                if (detailById.getRoleName().equals("JUSTICEENTADMIN")) {
                    justiceEntAdminJFrame.setVisible(true);
                }

                if (detailById.getRoleName().equals("PHSYCENTADMIN")) {
                    psychWardPage.setVisible(true);
                }

                if (detailById.getRoleName().equals("PATIENTENTADMIN")) {
                    enterpriseAdminJFrame.setVisible(true);
                }

            } else {
                JOptionPane.showMessageDialog(this, "username or password is incorrect please try again...!!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No User Found");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        signUp.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXTuSERnAME;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mainImage1;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

}
