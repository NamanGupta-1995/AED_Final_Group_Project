/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.Diagnostics;
import Business.Organization.Medical;
import Business.Organization.Organization;
import Business.Person.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DiagnosticsWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Noordeep
 */
public class RequestLabTestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Patient patientAccount;
    private Medical organization;
    EcoSystem ecosystem;
    Network network;
    //private DiagnosticsWorkRequest testRequest;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestLabTestJPanel(JPanel userProcessContainer, UserAccount account, Patient patientAccount, Enterprise enterprise,Medical organization, EcoSystem ecosystem, Network network) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.patientAccount=patientAccount;
        this.organization=organization;
        this.ecosystem=ecosystem;
        this.network=network;
         btn_request.setEnabled(true);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_request = new javax.swing.JButton();
        txt_message_as_comments = new javax.swing.JTextField();
        btn_back = new javax.swing.JButton();
        lbl_addtest1 = new javax.swing.JLabel();
        reactive = new javax.swing.JCheckBox();
        bloodtyping = new javax.swing.JCheckBox();
        survivalcapability = new javax.swing.JCheckBox();
        txt_addtest_one_val = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_frequent_test_conducted = new javax.swing.JLabel();
        wbcCount = new javax.swing.JCheckBox();
        liverCulture = new javax.swing.JCheckBox();
        kidneyCulture = new javax.swing.JCheckBox();
        lbl_addtest2 = new javax.swing.JLabel();
        txt_addTest_val_2 = new javax.swing.JTextField();
        lbl_addTest3 = new javax.swing.JLabel();
        txt_addtest_val_3 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        btn_request.setBackground(new java.awt.Color(0, 51, 102));
        btn_request.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_request.setForeground(new java.awt.Color(255, 255, 255));
        btn_request.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/request_service_24px.png"))); // NOI18N
        btn_request.setText("Request Tests");
        btn_request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_requestActionPerformed(evt);
            }
        });

        txt_message_as_comments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_message_as_commentsActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(0, 51, 102));
        btn_back.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back3.png"))); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        lbl_addtest1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lbl_addtest1.setText("Additional test");

        reactive.setBackground(new java.awt.Color(255, 255, 255));
        reactive.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        reactive.setText("Reactive Antibodies ");
        reactive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reactiveActionPerformed(evt);
            }
        });

        bloodtyping.setBackground(new java.awt.Color(255, 255, 255));
        bloodtyping.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        bloodtyping.setText("Blood Typing");

        survivalcapability.setBackground(new java.awt.Color(255, 255, 255));
        survivalcapability.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        survivalcapability.setText("Survival Capability");

        txt_addtest_one_val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addtest_one_valActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel4.setText("Comments");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("REQUEST TEST ");

        lbl_frequent_test_conducted.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lbl_frequent_test_conducted.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_frequent_test_conducted.setText("Frequent Tests Conducted");

        wbcCount.setBackground(new java.awt.Color(255, 255, 255));
        wbcCount.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        wbcCount.setText("WBC Count");
        wbcCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wbcCountActionPerformed(evt);
            }
        });

        liverCulture.setBackground(new java.awt.Color(255, 255, 255));
        liverCulture.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        liverCulture.setText("Liver Culture");

        kidneyCulture.setBackground(new java.awt.Color(255, 255, 255));
        kidneyCulture.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        kidneyCulture.setText("Kidney Culture");
        kidneyCulture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kidneyCultureActionPerformed(evt);
            }
        });

        lbl_addtest2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lbl_addtest2.setText("Additional test");

        txt_addTest_val_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addTest_val_2ActionPerformed(evt);
            }
        });

        lbl_addTest3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lbl_addTest3.setText("Additional test");

        txt_addtest_val_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addtest_val_3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(397, 397, 397)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_request, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_frequent_test_conducted, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_message_as_comments, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_addTest3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_addtest_val_3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_addtest2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_addTest_val_2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_addtest1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_addtest_one_val, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bloodtyping)
                                    .addComponent(reactive, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(survivalcapability, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wbcCount)
                                    .addComponent(liverCulture)
                                    .addComponent(kidneyCulture)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(316, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(lbl_frequent_test_conducted)
                .addGap(21, 21, 21)
                .addComponent(bloodtyping)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(survivalcapability)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reactive)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wbcCount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(liverCulture)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kidneyCulture)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_addtest_one_val, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_addtest1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_addTest_val_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_addtest2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_addtest_val_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_addTest3))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_message_as_comments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_back)
                    .addComponent(btn_request))
                .addContainerGap(243, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_requestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_requestActionPerformed
        
        String message = txt_message_as_comments.getText();
        int f=0;

        DiagnosticsWorkRequest request = new DiagnosticsWorkRequest();
        request.setPatientAccount(patientAccount);
        
        if(message==null||message.equals("")){
            JOptionPane.showMessageDialog(null, "Wait ! Please fill the comments field");
            
            return;
        }
        request.setMessage(message);
 
        if(bloodtyping.isSelected()){
               f=1;
            request.getTests().add("Blood Typing");
        }
        if(survivalcapability.isSelected()){
            f=1;
            request.getTests().add("Survival Capability");
        }
        if(reactive.isSelected()){
            f=1;
            request.getTests().add("Reactive Antibodies");
        }
        if(wbcCount.isSelected()){
            f=1;
            request.getTests().add("WBC Count");
        }
        if(liverCulture.isSelected()){
            f=1;
            request.getTests().add("Liver Culture");
        }
        if(kidneyCulture.isSelected()){
            f=1;
            request.getTests().add("Kidney Culture");
        }
        if(!txt_addtest_one_val.getText().isEmpty()){
            f=1;
            request.getTests().add(txt_addtest_one_val.getText());
        }
        if(!txt_addTest_val_2.getText().isEmpty()){
            f=1;
            request.getTests().add(txt_addTest_val_2.getText());
        }if(!txt_addtest_val_3.getText().isEmpty()){
            f=1;
            request.getTests().add(txt_addtest_val_3.getText());
        }
        
        
        boolean check;
        check=f>0;
        if(!check){
            JOptionPane.showMessageDialog(null,"Please selects testes to perform");
            return;
        }

        request.setSender(userAccount);
        request.setStatus("Sent");
        
        Organization org = null;
        Enterprise e=null;
        
        for(Enterprise ent: network.getEnterpriseDirectory().getEnterpriseList()){
            if(ent instanceof HospitalEnterprise&&ent.getName().equalsIgnoreCase(enterprise.getName())){
                e=ent;
                ent.getWorkQueue().getWorkRequestList().add(request);
                userAccount.getWorkQueue().getWorkRequestList().add(request);
            }
        }
          
        if(f==0){
            JOptionPane.showMessageDialog(null, "Please fill the details");
        }else{
        JOptionPane.showMessageDialog(null, "Test requested");
        patientAccount.setAlive(false);// to not repeat patient
        btn_request.setEnabled(false);}
        
        DoctorWorkAreaJPanel backbtn=new DoctorWorkAreaJPanel(userProcessContainer,userAccount,organization,enterprise,ecosystem,network);
        userProcessContainer.add("Customer Adding",backbtn);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btn_requestActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
  
        DoctorWorkAreaJPanel backbtn =new DoctorWorkAreaJPanel(userProcessContainer,userAccount,organization,enterprise,ecosystem,network);
        userProcessContainer.add("Customer Adding",backbtn);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_addtest_one_valActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addtest_one_valActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addtest_one_valActionPerformed

    private void reactiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reactiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reactiveActionPerformed

    private void txt_message_as_commentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_message_as_commentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_message_as_commentsActionPerformed

    private void wbcCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wbcCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wbcCountActionPerformed

    private void kidneyCultureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kidneyCultureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kidneyCultureActionPerformed

    private void txt_addTest_val_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addTest_val_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addTest_val_2ActionPerformed

    private void txt_addtest_val_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addtest_val_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addtest_val_3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox bloodtyping;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_request;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JCheckBox kidneyCulture;
    private javax.swing.JLabel lbl_addTest3;
    private javax.swing.JLabel lbl_addtest1;
    private javax.swing.JLabel lbl_addtest2;
    private javax.swing.JLabel lbl_frequent_test_conducted;
    private javax.swing.JCheckBox liverCulture;
    private javax.swing.JCheckBox reactive;
    private javax.swing.JCheckBox survivalcapability;
    private javax.swing.JTextField txt_addTest_val_2;
    private javax.swing.JTextField txt_addtest_one_val;
    private javax.swing.JTextField txt_addtest_val_3;
    private javax.swing.JTextField txt_message_as_comments;
    private javax.swing.JCheckBox wbcCount;
    // End of variables declaration//GEN-END:variables
}
