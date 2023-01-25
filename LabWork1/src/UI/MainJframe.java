/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Model.Person;
import Model.Contact;
import Model.Address;

/**
 *
 * @author jashpandav
 */
public class MainJframe extends javax.swing.JFrame {

    /**
     * Creates new form MainJframe
     */
    
    private Person person;
    public MainJframe() {
        initComponents();
        
        this.person = new Person();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPanel = new javax.swing.JSplitPane();
        createPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        createNUID = new javax.swing.JTextField();
        createFirstName = new javax.swing.JTextField();
        creatLastName = new javax.swing.JTextField();
        createColgName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ofcMail = new javax.swing.JTextField();
        prsnMail = new javax.swing.JTextField();
        ofcPhn = new javax.swing.JTextField();
        prsnPhn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CurrAddress = new javax.swing.JTextField();
        CurrApt = new javax.swing.JTextField();
        PermAddress = new javax.swing.JTextField();
        PermApt = new javax.swing.JTextField();
        CurrCity = new javax.swing.JTextField();
        PermCity = new javax.swing.JTextField();
        permZipcode = new javax.swing.JTextField();
        currZipcode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        viewPanel = new javax.swing.JPanel();
        viewNUID = new javax.swing.JLabel();
        ViewFirstname = new javax.swing.JLabel();
        ViewLastName = new javax.swing.JLabel();
        ViewCollegeName = new javax.swing.JLabel();
        ViewOfficePhn = new javax.swing.JLabel();
        ViewPersnlPhn = new javax.swing.JLabel();
        ViewOfficemail = new javax.swing.JLabel();
        ViewPersnlmail = new javax.swing.JLabel();
        ViewCurrentStr = new javax.swing.JLabel();
        ViewPermanentStr = new javax.swing.JLabel();
        ViewCurrentApt = new javax.swing.JLabel();
        ViewPermanentApt = new javax.swing.JLabel();
        ViewCurrentCity = new javax.swing.JLabel();
        ViewPermanentCity = new javax.swing.JLabel();
        ViewCurrentZip = new javax.swing.JLabel();
        ViewPermanentZip = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createPanel.setBackground(new java.awt.Color(255, 51, 0));

        jLabel1.setText("Student's Information");

        createNUID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNUIDActionPerformed(evt);
            }
        });

        createFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFirstNameActionPerformed(evt);
            }
        });

        creatLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creatLastNameActionPerformed(evt);
            }
        });

        createColgName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createColgNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Contact Information");

        ofcMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ofcMailActionPerformed(evt);
            }
        });

        jLabel3.setText("Address Information");

        CurrApt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurrAptActionPerformed(evt);
            }
        });

        CurrCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurrCityActionPerformed(evt);
            }
        });

        PermCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PermCityActionPerformed(evt);
            }
        });

        permZipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permZipcodeActionPerformed(evt);
            }
        });

        currZipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currZipcodeActionPerformed(evt);
            }
        });

        jLabel4.setText("NUID");

        jLabel5.setText("First Name");

        jLabel6.setText("Last Name");

        jLabel7.setText("College Name");

        jLabel9.setText("Office");

        jLabel10.setText("Personal");

        jLabel11.setText("Phone");

        jLabel12.setText("Email");

        jLabel13.setText("Street");

        jLabel14.setText("Apt. No");

        jLabel15.setText("City");

        jLabel16.setText("Zipcode");

        jButton1.setText("save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createPanelLayout = new javax.swing.GroupLayout(createPanel);
        createPanel.setLayout(createPanelLayout);
        createPanelLayout.setHorizontalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(createPanelLayout.createSequentialGroup()
                        .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(95, 95, 95)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createPanelLayout.createSequentialGroup()
                .addGap(0, 69, Short.MAX_VALUE)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createPanelLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(createPanelLayout.createSequentialGroup()
                        .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addComponent(jLabel14)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createPanelLayout.createSequentialGroup()
                                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, createPanelLayout.createSequentialGroup()
                                        .addComponent(CurrAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PermAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                                    .addGroup(createPanelLayout.createSequentialGroup()
                                        .addComponent(CurrApt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PermApt))
                                    .addGroup(createPanelLayout.createSequentialGroup()
                                        .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(prsnPhn, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                            .addComponent(ofcPhn))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(prsnMail, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                                .addComponent(ofcMail)))))
                                .addGap(6, 6, 6))
                            .addGroup(createPanelLayout.createSequentialGroup()
                                .addComponent(CurrCity, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PermCity))
                            .addGroup(createPanelLayout.createSequentialGroup()
                                .addComponent(currZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(permZipcode)))))
                .addGap(33, 33, 33))
            .addGroup(createPanelLayout.createSequentialGroup()
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(createPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createNUID, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(createPanelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(createColgName, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(createPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(createPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(creatLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(createPanelLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(119, 119, 119))
        );
        createPanelLayout.setVerticalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createNUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creatLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(createPanelLayout.createSequentialGroup()
                        .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createColgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12))))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ofcMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ofcPhn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prsnMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(prsnPhn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CurrAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PermAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PermApt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CurrApt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CurrCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PermCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(permZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        SplitPanel.setLeftComponent(createPanel);

        viewPanel.setBackground(new java.awt.Color(255, 255, 255));

        viewNUID.setText("jLabel17");

        ViewFirstname.setText("jLabel18");

        ViewLastName.setText("jLabel19");

        ViewCollegeName.setText("jLabel20");

        ViewOfficePhn.setText("jLabel21");

        ViewPersnlPhn.setText("jLabel22");

        ViewOfficemail.setText("jLabel23");

        ViewPersnlmail.setText("jLabel24");

        ViewCurrentStr.setText("jLabel25");

        ViewPermanentStr.setText("jLabel26");

        ViewCurrentApt.setText("jLabel27");

        ViewPermanentApt.setText("jLabel28");

        ViewCurrentCity.setText("jLabel17");

        ViewPermanentCity.setText("jLabel18");

        ViewCurrentZip.setText("jLabel19");

        ViewPermanentZip.setText("jLabel20");

        javax.swing.GroupLayout viewPanelLayout = new javax.swing.GroupLayout(viewPanel);
        viewPanel.setLayout(viewPanelLayout);
        viewPanelLayout.setHorizontalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPanelLayout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewNUID, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewOfficePhn)
                    .addComponent(ViewOfficemail)
                    .addComponent(ViewCurrentStr)
                    .addComponent(ViewCurrentApt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewCurrentCity)
                    .addComponent(ViewCurrentZip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewPermanentStr)
                    .addComponent(ViewPersnlmail)
                    .addComponent(ViewPersnlPhn)
                    .addComponent(ViewCollegeName)
                    .addComponent(ViewFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewPermanentApt, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewPermanentCity)
                    .addComponent(ViewPermanentZip))
                .addGap(56, 56, 56))
        );
        viewPanelLayout.setVerticalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewNUID)
                    .addComponent(ViewFirstname))
                .addGap(18, 18, 18)
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewLastName)
                    .addComponent(ViewCollegeName))
                .addGap(27, 27, 27)
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewOfficePhn)
                    .addComponent(ViewPersnlPhn))
                .addGap(26, 26, 26)
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewOfficemail)
                    .addComponent(ViewPersnlmail))
                .addGap(18, 18, 18)
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewCurrentStr)
                    .addComponent(ViewPermanentStr))
                .addGap(18, 18, 18)
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewCurrentApt)
                    .addComponent(ViewPermanentApt))
                .addGap(18, 18, 18)
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewCurrentCity)
                    .addComponent(ViewPermanentCity))
                .addGap(18, 18, 18)
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewCurrentZip)
                    .addComponent(ViewPermanentZip))
                .addContainerGap(288, Short.MAX_VALUE))
        );

        SplitPanel.setRightComponent(viewPanel);

        getContentPane().add(SplitPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createNUIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNUIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createNUIDActionPerformed

    private void creatLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creatLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creatLastNameActionPerformed

    private void createColgNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createColgNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createColgNameActionPerformed

    private void createFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createFirstNameActionPerformed

    private void ofcMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ofcMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ofcMailActionPerformed

    private void CurrAptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrAptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CurrAptActionPerformed

    private void CurrCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CurrCityActionPerformed

    private void currZipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currZipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currZipcodeActionPerformed

    private void PermCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PermCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PermCityActionPerformed

    private void permZipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permZipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_permZipcodeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String NUID = createNUID.getText();
        String firstName = createFirstName.getText();
        String lastName = creatLastName.getText();
        String collegeName = createColgName.getText();
        String emailID = ofcMail.getText();
        String prsEmail = prsnMail.getText();
        String street = CurrAddress.getText();
        String permAddress = PermAddress.getText();
        String aptNo = CurrApt.getText();
        String permaptNo = PermApt.getText();
        String city = CurrCity.getText();
        String permCity = PermCity.getText();
        long zipcode = Long.valueOf(currZipcode.getText());
        long permzipcode = Long.valueOf(permZipcode.getText());
        long phoneNo = Long.valueOf(ofcPhn.getText());
        long persNo = Long.valueOf(prsnPhn.getText());
        
        this.person.setNUID(NUID);
        
        Address address = this.person.getAddress();
        address.setStreet(street);
        
        Address  permanentAddress = this.person.getPermanentAddress();
        permanentAddress.setStreet(permAddress);
        
        Address currentCity = this.person.getCurrentCity();
        currentCity.setCity(city);
        
        Address permanentCity = this.person.getPermanentCity();
        permanentCity.setCity(city);
        
        Address permapartmentNo = this.person.getPermapartmentNo();
        permapartmentNo.setAptNo(aptNo);
        
        Address  apartmentNo = this.person.getApartmentNo();
        apartmentNo.getAptNo();
        
        Address currentzipcode = this.person.getCurrentzipcode();
        currentzipcode.setZipcode(zipcode);
        
        Address permanentzipcode = this.person.getPermanentzipcode();
        permanentzipcode.setZipcode(zipcode);
        
       Contact officemail = this.person.getOfficemail();
       officemail.setEmailID(emailID);
       
       Contact personalemail = this.person.getPersonalemail();
       personalemail.setEmailID(emailID);
       
       Contact officephone = this.person.getOfficephone();
       officephone.setPhoneNumber(phoneNo);
       
       Contact personalphone = this.person.getPersonalphone();
       personalphone.setPhoneNumber(phoneNo);
       
       display();
       
       
       
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
private void display(){
    
    viewNUID.setText(this.person.getNUID());
    ViewFirstname.setText(this.person.getFirstName());
    ViewLastName.setText(this.person.getLastName());
    ViewCollegeName.setText(this.person.getCollegeName());
    ViewOfficePhn.setText(String.valueOf(this.person.getOfficephone().getPhoneNumber()));
    ViewPersnlPhn.setText(String.valueOf(this.person.getPersonalphone().getPhoneNumber()));
    ViewOfficemail.setText(String.valueOf(this.person.getOfficemail().getEmailID()));
    ViewPersnlmail.setText(String.valueOf(this.person.getPersonalemail().getEmailID()));
    ViewCurrentStr.setText(String.valueOf(this.person.getAddress().getStreet()));
    ViewPermanentStr.setText(String.valueOf(this.person.getPermanentAddress().getStreet()));
    ViewCurrentApt.setText(String.valueOf(this.person.getApartmentNo().getAptNo()));
    ViewPermanentApt.setText(String.valueOf(this.person.getPermapartmentNo().getAptNo()));
    ViewCurrentCity.setText(String.valueOf(this.person.getCurrentCity().getCity()));
    ViewPermanentCity.setText(String.valueOf(this.person.getPermanentCity().getCity()));
    ViewCurrentZip.setText(String.valueOf(this.person.getCurrentzipcode().getZipcode()));
    ViewPermanentZip.setText(String.valueOf(this.person.getPermanentzipcode().getZipcode()));
    
}
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
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CurrAddress;
    private javax.swing.JTextField CurrApt;
    private javax.swing.JTextField CurrCity;
    private javax.swing.JTextField PermAddress;
    private javax.swing.JTextField PermApt;
    private javax.swing.JTextField PermCity;
    private javax.swing.JSplitPane SplitPanel;
    private javax.swing.JLabel ViewCollegeName;
    private javax.swing.JLabel ViewCurrentApt;
    private javax.swing.JLabel ViewCurrentCity;
    private javax.swing.JLabel ViewCurrentStr;
    private javax.swing.JLabel ViewCurrentZip;
    private javax.swing.JLabel ViewFirstname;
    private javax.swing.JLabel ViewLastName;
    private javax.swing.JLabel ViewOfficePhn;
    private javax.swing.JLabel ViewOfficemail;
    private javax.swing.JLabel ViewPermanentApt;
    private javax.swing.JLabel ViewPermanentCity;
    private javax.swing.JLabel ViewPermanentStr;
    private javax.swing.JLabel ViewPermanentZip;
    private javax.swing.JLabel ViewPersnlPhn;
    private javax.swing.JLabel ViewPersnlmail;
    private javax.swing.JTextField creatLastName;
    private javax.swing.JTextField createColgName;
    private javax.swing.JTextField createFirstName;
    private javax.swing.JTextField createNUID;
    private javax.swing.JPanel createPanel;
    private javax.swing.JTextField currZipcode;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField ofcMail;
    private javax.swing.JTextField ofcPhn;
    private javax.swing.JTextField permZipcode;
    private javax.swing.JTextField prsnMail;
    private javax.swing.JTextField prsnPhn;
    private javax.swing.JLabel viewNUID;
    private javax.swing.JPanel viewPanel;
    // End of variables declaration//GEN-END:variables
}
