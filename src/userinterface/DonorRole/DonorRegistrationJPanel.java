/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DonorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.Donors;
import Business.Person.DonorsDirectory;
import java.awt.CardLayout;
import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author namangupta
 */
public class DonorRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonorRegistrationJPanel
     */
    JPanel userProcessContainer;
    String emailAdd;
    EcoSystem ecosystem;
    String city;
    DB4OUtil dB4OUtil;
    DonorsDirectory donorDirectory;
    List<String> userList = new ArrayList<String>();
      
    /**
     * Creates new form DonorRegistrationFormJPanel
     */
    List<String> organList = new ArrayList<String>();

    public DonorRegistrationJPanel(JPanel userProcessContainer, EcoSystem system, DonorsDirectory donorDirectory, DB4OUtil dB4OUtil) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        txtCity.setText(city);
        txtCity.setEnabled(false);
        this.ecosystem = system;
        this.city = city;
        this.donorDirectory = donorDirectory;
        this.dB4OUtil = dB4OUtil;
        populateUser();
    }

    public void populateUser() {
        for (Donors d : ecosystem.getDonorDirectory()) {
            userList.add(d.getDonorName());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblSex = new javax.swing.JLabel();
        lblBloodGroup = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblOrgan = new javax.swing.JLabel();
        lblPOCTitle = new javax.swing.JLabel();
        lblPOCName = new javax.swing.JLabel();
        lblPOCContact = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPOCName = new javax.swing.JTextField();
        txtPOCContact = new javax.swing.JTextField();
        radSexMale = new javax.swing.JRadioButton();
        radSexFemale = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();
        organToDonateJComboBox = new javax.swing.JComboBox();
        cbBloodGroup = new javax.swing.JComboBox();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        btnRegisterDonor = new javax.swing.JButton();
        radOrganAvailableNowYes = new javax.swing.JRadioButton();
        radOrganAvailableNo = new javax.swing.JRadioButton();
        lblOrganAvailable = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("DONOR REGISTRATION FORM");

        lblName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblName.setText("Name:");

        lblAge.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAge.setText("Age:");

        lblSex.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblSex.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSex.setText("Sex:");

        lblBloodGroup.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblBloodGroup.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblBloodGroup.setText("Blood Group:");

        lblContact.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblContact.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblContact.setText("Contact Number:");

        lblEmail.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEmail.setText("Email-Id:");

        lblAddress.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAddress.setText("Address:");

        lblOrgan.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblOrgan.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblOrgan.setText("Organ to donate:");

        lblPOCTitle.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        lblPOCTitle.setText("Point of contact in emergency:");

        lblPOCName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblPOCName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPOCName.setText("Name:");

        lblPOCContact.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblPOCContact.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPOCContact.setText("Contact number:");

        txtName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtAge.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        txtContact.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        txtAddress.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        txtPOCName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        txtPOCContact.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtPOCContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPOCContactActionPerformed(evt);
            }
        });

        radSexMale.setBackground(new java.awt.Color(255, 255, 255));
        radSexMale.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        radSexMale.setText("Male");
        radSexMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radSexMaleActionPerformed(evt);
            }
        });

        radSexFemale.setBackground(new java.awt.Color(255, 255, 255));
        radSexFemale.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        radSexFemale.setText("Female");
        radSexFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radSexFemaleActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 102, 153));
        btnBack.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        organToDonateJComboBox.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        organToDonateJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Heart", "Lungs", "Kidneys", "Small Bowel", "Pancreas" }));
        organToDonateJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organToDonateJComboBoxActionPerformed(evt);
            }
        });

        cbBloodGroup.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        cbBloodGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "B Positive", "B Negative", "A Positive", "A Negative", "O Positive", "O Negative" }));
        cbBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBloodGroupActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCity.setText("City:");

        txtCity.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        btnRegisterDonor.setBackground(new java.awt.Color(0, 102, 153));
        btnRegisterDonor.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnRegisterDonor.setForeground(new java.awt.Color(255, 255, 255));
        btnRegisterDonor.setText("Register");
        btnRegisterDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterDonorActionPerformed(evt);
            }
        });

        radOrganAvailableNowYes.setBackground(new java.awt.Color(255, 255, 255));
        radOrganAvailableNowYes.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        radOrganAvailableNowYes.setText("Yes");

        radOrganAvailableNo.setBackground(new java.awt.Color(255, 255, 255));
        radOrganAvailableNo.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        radOrganAvailableNo.setText("No");

        lblOrganAvailable.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblOrganAvailable.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblOrganAvailable.setText("Is organ available now:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(btnRegisterDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPOCTitle)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblBloodGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblSex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblOrgan))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblPOCName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblPOCContact, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblOrganAvailable)
                                .addGap(15, 15, 15)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radSexMale, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radSexFemale))
                            .addComponent(txtPOCContact, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPOCName, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(organToDonateJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radOrganAvailableNowYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radOrganAvailableNo)))
                        .addGap(5, 5, 5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitle)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSex)
                    .addComponent(radSexMale)
                    .addComponent(radSexFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBloodGroup)
                    .addComponent(cbBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContact)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrgan)
                    .addComponent(organToDonateJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrganAvailable)
                    .addComponent(radOrganAvailableNowYes)
                    .addComponent(radOrganAvailableNo))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPOCTitle)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPOCName)
                            .addComponent(txtPOCName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPOCContact)
                            .addComponent(txtPOCContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btnRegisterDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPOCContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPOCContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPOCContactActionPerformed

    private void radSexMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radSexMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radSexMaleActionPerformed

    private void radSexFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radSexFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radSexFemaleActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void organToDonateJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organToDonateJComboBoxActionPerformed

        String selectedOrgan = organToDonateJComboBox.getSelectedItem().toString();
        organList.add((String) organToDonateJComboBox.getSelectedItem());
        //        if (lblOrgan1.getText() == "") {
            //            lblOrgan1.setText((String) organToDonateJComboBox.getSelectedItem());
            //        } else {
            //            lblOrgan1.setText(lblOrgan1.getText() + ", " + (String) organToDonateJComboBox.getSelectedItem());
            //        }
        //        organToDonateJComboBox.removeItem(selectedOrgan);
    }//GEN-LAST:event_organToDonateJComboBoxActionPerformed

    private void cbBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBloodGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBloodGroupActionPerformed

    
    public boolean checkFirstname(String text) {

        if (text.matches("^([A-Za-z]+)(\\s[A-Za-z]+)*\\s?$")) {
            for (String s : userList) {
                if (s.equalsIgnoreCase(text)) {
                    JOptionPane.showMessageDialog(null, "User already exists");
                    return false;
                }
            }

            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Names should contain only alphabets");
            return false;
        }
    }

    private boolean checkAge(String age) {
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(age);
        boolean bool = matcher.matches();
        if (!bool) {
            JOptionPane.showMessageDialog(null, "Age should only be numbers");
            return false;
        } else {
            int age1 = Integer.parseInt(age);
            if (age1 < 0 || age1 > 200) {
                JOptionPane.showMessageDialog(null, "Age should between");
            }
            return true;
        }
    }

    private boolean checkPhone(String ph) {
        Pattern pattern = Pattern.compile("[0-9]{10}");
        Matcher matcher = pattern.matcher(ph);
        boolean bool = matcher.matches();
        if (!bool) {
            return true;
        } else {

            return true;
        }
    }

    private boolean checkUsernamePattern(String username) {
        int f = 0;

        Pattern pattern = Pattern.compile("(?!_).*[A-Za-z0-9._]+@[A-Za-z0-9._]+\\.[A-Za-z]{2,4}");
        Matcher matcher = pattern.matcher(username);
        boolean bool = matcher.matches();
        if (!bool) {
            JOptionPane.showMessageDialog(null, "Special characters are not allowed other than _, @");
            return false;
        } else {

            return true;
        }
    }

    boolean checkforunique() {
        return false;
    }
    
    private void btnRegisterDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterDonorActionPerformed

        int f = 0;
        String name = txtName.getText();
        //String lastname= txtName1.getText();
        String sex;
        emailAdd = txtEmail.getText();
        if (radSexMale.isSelected()) {
            sex = radSexMale.getText();
        } else {
            sex = radSexFemale.getText();
        }
        String bloodGroup = cbBloodGroup.getSelectedItem().toString();
        String contactNumber = txtContact.getText();
        String address = txtAddress.getText();
        String emergencyPOC = txtPOCName.getText();
        String emergencyPOC_Num = txtPOCContact.getText();
        int age = 30;

        boolean isOrganAvaiNow = false;
        if (radOrganAvailableNowYes.isSelected()) {
            isOrganAvaiNow = true;
        } else if (radOrganAvailableNo.isSelected()) {
            isOrganAvaiNow = false;
        }

        if (checkFirstname(name)) {
            f++;
        } else {
            return;
        }
        if (checkAge(txtAge.getText())) {
            age = Integer.parseInt(txtAge.getText());
            f++;
        } else {
            return;
        }

        if(contactNumber == null || contactNumber.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter Contact Number");
            return;
        }
        else{
            if(!contactNumber.matches("^(?=.*[0-9]).{10,10}")){
                JOptionPane.showMessageDialog(null, "Please enter valid Contact Number");
                return;
            }
        }

        if (checkUsernamePattern(emailAdd)) {
            f++;
        } else {
            return;
        }
        if (address.equals("")) {
            JOptionPane.showMessageDialog(null, "Address cannot be empty");
            return;
        }
        if(emergencyPOC_Num == null || emergencyPOC_Num.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter Contact Number");
            return;
        }
        else{
            if(!emergencyPOC_Num.matches("^(?=.*[0-9]).{10,10}")){
                JOptionPane.showMessageDialog(null, "Please enter valid Contact Number");
                return;
            }
        }

        if (checkFirstname(emergencyPOC)) {
            f++;
        } else {
            return;
        }

        Donors d = ecosystem.createDonor(name, age, sex, bloodGroup, contactNumber, address, emailAdd, emergencyPOC, emergencyPOC_Num, isOrganAvaiNow, organList);
        dB4OUtil.storeSystem(ecosystem);
        JOptionPane.showMessageDialog(null, "Thanks for donation");
        populateUser();
    }//GEN-LAST:event_btnRegisterDonorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegisterDonor;
    private javax.swing.JComboBox cbBloodGroup;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBloodGroup;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrgan;
    private javax.swing.JLabel lblOrganAvailable;
    private javax.swing.JLabel lblPOCContact;
    private javax.swing.JLabel lblPOCName;
    private javax.swing.JLabel lblPOCTitle;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JComboBox organToDonateJComboBox;
    private javax.swing.JRadioButton radOrganAvailableNo;
    private javax.swing.JRadioButton radOrganAvailableNowYes;
    private javax.swing.JRadioButton radSexFemale;
    private javax.swing.JRadioButton radSexMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPOCContact;
    private javax.swing.JTextField txtPOCName;
    // End of variables declaration//GEN-END:variables
}
