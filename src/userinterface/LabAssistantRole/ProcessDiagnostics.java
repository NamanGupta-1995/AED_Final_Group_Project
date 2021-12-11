/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabAssistantRole;

import Business.WorkQueue.DiagnosticsWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Noordeep
 */
public class ProcessDiagnostics extends javax.swing.JPanel {

    JPanel userProcessContainer;
    DiagnosticsWorkRequest request;
    private String others;

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessDiagnostics(JPanel userProcessContainer, DiagnosticsWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        load_lables();

    }

    public void load_lables() {
   
        txt_bloodtyping.setVisible(false);
        comboBox_blood_Typing.setVisible(false);
        txt_survival.setVisible(false);
        comboBox_survival_capability.setVisible(false);
        txt_antibodies.setVisible(false);
        comboBox_reactive_anti_bodies.setVisible(false);
        lbl_wbcCount.setVisible(false);
        lbl_liver.setVisible(false);
        lbl_kidney.setVisible(false);
        comboBox_whiteBloodCells.setVisible(false);
        comboBox_liver_culture.setVisible(false);
        comboBox_kidney_culture.setVisible(false);
        txt_random1.setVisible(false);
        comboBox_random_one.setVisible(false);
        txt_random2.setVisible(false);
        comboBox_random_two.setVisible(false);
        txt_random2.setVisible(false);
        comboBox_random_two.setVisible(false);
        txt_random3.setVisible(false);
        comboBox_random_three.setVisible(false);
        
        List<JLabel> labels = Arrays.asList(txt_random1, txt_random2, txt_random3);
        List<JComboBox> cboxes = Arrays.asList(comboBox_random_one, comboBox_random_two, comboBox_random_three);
        int counter=0;
        
        System.out.println("Test Array in lab process"+request.getTests());
        for (String s : request.getTests()) {          
            
            if (s.equalsIgnoreCase("blood typing")) {
                txt_bloodtyping.setVisible(true);
                comboBox_blood_Typing.setVisible(true);    
            }
            if (s.equalsIgnoreCase("survival capability")) {
                txt_antibodies.setVisible(true);
                comboBox_reactive_anti_bodies.setVisible(true);
            }
            if (s.equalsIgnoreCase("reactive antibodies")) {
                txt_survival.setVisible(true);
                comboBox_survival_capability.setVisible(true);
            }
            if (s.equalsIgnoreCase("wbc count")) {
                lbl_wbcCount.setVisible(true);
                comboBox_whiteBloodCells.setVisible(true);
            }
            if (s.equalsIgnoreCase("liver culture")) {
                lbl_liver.setVisible(true);
                comboBox_liver_culture.setVisible(true);
            }
            if (s.equalsIgnoreCase("kidney culture")) {
                lbl_kidney.setVisible(true);
                comboBox_kidney_culture.setVisible(true);
            }           
            
            if (!(s.equalsIgnoreCase("kidney culture")||s.equalsIgnoreCase("liver culture")||s.equalsIgnoreCase("wbc count")||s.equalsIgnoreCase("blood typing") || s.equalsIgnoreCase("survival capability") || s.equalsIgnoreCase("reactive antibodies"))) {
                labels.get(counter).setVisible(true);
                labels.get(counter).setText(s);
                cboxes.get(counter).setVisible(true);
                counter++;

            }
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

        btn_generate_result = new javax.swing.JButton();
        txt_result = new javax.swing.JLabel();
        txt_result_comment_val = new javax.swing.JTextField();
        btn_back = new javax.swing.JButton();
        txt_bloodtyping = new javax.swing.JLabel();
        txt_survival = new javax.swing.JLabel();
        txt_antibodies = new javax.swing.JLabel();
        comboBox_blood_Typing = new javax.swing.JComboBox();
        comboBox_survival_capability = new javax.swing.JComboBox();
        comboBox_reactive_anti_bodies = new javax.swing.JComboBox();
        txt_random1 = new javax.swing.JLabel();
        comboBox_random_one = new javax.swing.JComboBox();
        lbl_lab_test = new javax.swing.JLabel();
        lbl_wbcCount = new javax.swing.JLabel();
        lbl_liver = new javax.swing.JLabel();
        lbl_kidney = new javax.swing.JLabel();
        comboBox_whiteBloodCells = new javax.swing.JComboBox<>();
        comboBox_liver_culture = new javax.swing.JComboBox<>();
        comboBox_kidney_culture = new javax.swing.JComboBox<>();
        comboBox_random_two = new javax.swing.JComboBox();
        txt_random2 = new javax.swing.JLabel();
        comboBox_random_three = new javax.swing.JComboBox();
        txt_random3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        btn_generate_result.setBackground(new java.awt.Color(0, 102, 153));
        btn_generate_result.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_generate_result.setForeground(new java.awt.Color(255, 255, 255));
        btn_generate_result.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/test_passed_30px.png"))); // NOI18N
        btn_generate_result.setText("Generate Result");
        btn_generate_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generate_resultActionPerformed(evt);
            }
        });

        txt_result.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txt_result.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txt_result.setText("Result:");

        txt_result_comment_val.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        btn_back.setBackground(new java.awt.Color(0, 102, 153));
        btn_back.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back3.png"))); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        txt_bloodtyping.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txt_bloodtyping.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txt_bloodtyping.setText("Blood Typing");

        txt_survival.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txt_survival.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txt_survival.setText("Survival Capability");

        txt_antibodies.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txt_antibodies.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txt_antibodies.setText("Reactive Antibodies");

        comboBox_blood_Typing.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        comboBox_blood_Typing.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "Normal ", "Abnormal", " " }));

        comboBox_survival_capability.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        comboBox_survival_capability.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "Normal ", "Abnormal", " " }));
        comboBox_survival_capability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_survival_capabilityActionPerformed(evt);
            }
        });

        comboBox_reactive_anti_bodies.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        comboBox_reactive_anti_bodies.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "10%-20%", "20%-40%", "40%-60%", "60%-80%", ">80%", " " }));
        comboBox_reactive_anti_bodies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_reactive_anti_bodiesActionPerformed(evt);
            }
        });

        txt_random1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txt_random1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txt_random1.setText("Random:");

        comboBox_random_one.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        comboBox_random_one.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "Normal ", "Abnormal", " " }));
        comboBox_random_one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_random_oneActionPerformed(evt);
            }
        });

        lbl_lab_test.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lbl_lab_test.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_lab_test.setText("LAB TESTS");

        lbl_wbcCount.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lbl_wbcCount.setText("WBC Count");

        lbl_liver.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lbl_liver.setText("Liver Culture");

        lbl_kidney.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lbl_kidney.setText("Kidney Culture :");

        comboBox_whiteBloodCells.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Normal ", "Abnormal" }));

        comboBox_liver_culture.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Normal ", "Abnormal" }));

        comboBox_kidney_culture.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Normal ", "Abnormal" }));

        comboBox_random_two.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        comboBox_random_two.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "Normal ", "Abnormal", " " }));
        comboBox_random_two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_random_twoActionPerformed(evt);
            }
        });

        txt_random2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txt_random2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txt_random2.setText("Random:");

        comboBox_random_three.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        comboBox_random_three.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "Normal ", "Abnormal", " " }));
        comboBox_random_three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_random_threeActionPerformed(evt);
            }
        });

        txt_random3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txt_random3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txt_random3.setText("Random:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btn_back))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_lab_test, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_antibodies)
                                            .addComponent(txt_survival)
                                            .addComponent(txt_bloodtyping)
                                            .addComponent(lbl_wbcCount)
                                            .addComponent(lbl_liver)
                                            .addComponent(lbl_kidney)
                                            .addComponent(txt_random1)
                                            .addComponent(txt_random2)
                                            .addComponent(txt_random3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(comboBox_liver_culture, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboBox_kidney_culture, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboBox_blood_Typing, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboBox_survival_capability, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboBox_reactive_anti_bodies, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboBox_whiteBloodCells, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboBox_random_one, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboBox_random_two, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboBox_random_three, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txt_result)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_result_comment_val, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(384, 384, 384)
                                .addComponent(btn_generate_result, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbl_lab_test)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_bloodtyping)
                    .addComponent(comboBox_blood_Typing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_survival)
                    .addComponent(comboBox_survival_capability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_antibodies)
                    .addComponent(comboBox_reactive_anti_bodies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_wbcCount)
                    .addComponent(comboBox_whiteBloodCells, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_liver)
                    .addComponent(comboBox_liver_culture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_kidney)
                    .addComponent(comboBox_kidney_culture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_random1)
                    .addComponent(comboBox_random_one, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox_random_two, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_random2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_random3)
                    .addComponent(comboBox_random_three, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_result_comment_val, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_result))
                .addGap(18, 18, 18)
                .addComponent(btn_generate_result, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DiagnosticsWorkArea dwjp = (DiagnosticsWorkArea) component;
        dwjp.load_work_tbl();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_generate_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generate_resultActionPerformed
        request.setTestResult(txt_result_comment_val.getText());
        String test1 = comboBox_blood_Typing.getSelectedItem().toString();    
        String test2 = comboBox_survival_capability.getSelectedItem().toString();
        String test3 = comboBox_reactive_anti_bodies.getSelectedItem().toString();
        String test4 = comboBox_whiteBloodCells.getSelectedItem().toString();
        String test5 = comboBox_liver_culture.getSelectedItem().toString();
        String test6 = comboBox_kidney_culture.getSelectedItem().toString();
        String test7 = comboBox_random_one.getSelectedItem().toString();
        String test8 = comboBox_random_two.getSelectedItem().toString();
        String test9 = comboBox_random_three.getSelectedItem().toString();
        
        ArrayList<String> sample= new ArrayList<>();
        //Blff Typing, Survival, Reactive antibodies// random//comments
        if(!(test1=="-"||test1.isBlank()||test1.isEmpty())){
            sample.add(test1);
        }
        if(!(test2=="-"||test2.isBlank()||test2.isEmpty())){
            sample.add(test2);
        }
        if(!(test3=="-"||test3.isBlank()||test3.isEmpty())){
            sample.add(test3);
        }
        if(!(test4=="-"||test4.isBlank()||test4.isEmpty())){
            sample.add(test4);
        }
        if(!(test5=="-"||test5.isBlank()||test5.isEmpty())){
            sample.add(test5);
        }
        if(!(test6=="-"||test6.isBlank()||test6.isEmpty())){
            sample.add(test6);
        }
        if(!(test7=="-"||test7.isBlank()||test7.isEmpty())){
            sample.add(test7);
        }
        if(!(test8=="-"||test8.isBlank()||test8.isEmpty())){
            sample.add(test8);
        }
        if(!(test9=="-"||test9.isBlank()||test9.isEmpty())){
            sample.add(test9);
        }
        
        boolean check;
        check=sample.size()>0;
        if(!check){
            JOptionPane.showMessageDialog(null, "Please perform the tests for proper evaluation");
            return;
        }
        request.setTestData(sample);
        request.setStatus("Completed");
        JOptionPane.showMessageDialog(null,"Report has been sent");
        System.out.println(request.getTestData()+"This is test data");
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DiagnosticsWorkArea dwjp = (DiagnosticsWorkArea) component;
        dwjp.load_work_tbl();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btn_generate_resultActionPerformed

    private void comboBox_reactive_anti_bodiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_reactive_anti_bodiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_reactive_anti_bodiesActionPerformed

    private void comboBox_random_oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_random_oneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_random_oneActionPerformed

    private void comboBox_survival_capabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_survival_capabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_survival_capabilityActionPerformed

    private void comboBox_random_twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_random_twoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_random_twoActionPerformed

    private void comboBox_random_threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_random_threeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_random_threeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_generate_result;
    private javax.swing.JComboBox comboBox_blood_Typing;
    private javax.swing.JComboBox<String> comboBox_kidney_culture;
    private javax.swing.JComboBox<String> comboBox_liver_culture;
    private javax.swing.JComboBox comboBox_random_one;
    private javax.swing.JComboBox comboBox_random_three;
    private javax.swing.JComboBox comboBox_random_two;
    private javax.swing.JComboBox comboBox_reactive_anti_bodies;
    private javax.swing.JComboBox comboBox_survival_capability;
    private javax.swing.JComboBox<String> comboBox_whiteBloodCells;
    private javax.swing.JLabel lbl_kidney;
    private javax.swing.JLabel lbl_lab_test;
    private javax.swing.JLabel lbl_liver;
    private javax.swing.JLabel lbl_wbcCount;
    private javax.swing.JLabel txt_antibodies;
    private javax.swing.JLabel txt_bloodtyping;
    private javax.swing.JLabel txt_random1;
    private javax.swing.JLabel txt_random2;
    private javax.swing.JLabel txt_random3;
    private javax.swing.JLabel txt_result;
    private javax.swing.JTextField txt_result_comment_val;
    private javax.swing.JLabel txt_survival;
    // End of variables declaration//GEN-END:variables
}
