/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.*;
import Business.Network.Network;
import Business.Organization.HealthCare;
import Business.Organization.OrganOffice;
import Business.Organization.Organization;
import Business.Person.Patients;
import Business.Users.Users;
import Business.Waitlist.Wait;
import Business.WorkQueue.DiagnosticsWorkRequest;
import Business.WorkQueue.OrganMatchWorkRequest;
import Business.WorkQueue.OrganProcureWorkRequest;
import Business.WorkQueue.TherapistWorkRequest;
import Business.WorkQueue.WaitlistWorkRequest;
import Business.WorkQueue.WorkRequest;
import com.db4o.User;
import java.awt.CardLayout;
import java.awt.Desktop;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Noordeep
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private HealthCare organization;
    private Enterprise enterprise;
    private Users userAccount;
    private EnterpriseDirectory enterpriseDirectory;
    private EcoSystem ecosystem;
    private Network network;

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, Users account, HealthCare organization, Enterprise enterprise, EcoSystem ecosystem, Network network) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
        this.userAccount = account;
        this.enterpriseDirectory = new EnterpriseDirectory();
        this.network = network;
        txt_patient_age.setVisible(false);
        lblAge.setVisible(false);
        lblName1.setVisible(false);
        txt_patient_name.setVisible(false);
		        btn_request_Test.setVisible(false);
        
        
        populate_patients_in_comboBox();
        LoadRequestTable();
        load_wait_table();

    }


    public void populate_patients_in_comboBox(){
        comboBox_patients.addItem("--Select");
        for(int i=0;i<organization.getPatientDirectory().getListOfPatient().size();i++){
            if((organization.getPatientDirectory().getListOfPatient().get(i).getDoctor().equalsIgnoreCase(userAccount.getEmployee().getEmployeeName()))&&organization.getPatientDirectory().getListOfPatient().get(i).isIsAlive()){
                comboBox_patients.addItem(organization.getPatientDirectory().getListOfPatient().get(i).getPatientId()+" : "+organization.getPatientDirectory().getListOfPatient().get(i).getPatientName());
            }
        }
    }
   
    public void load_wait_table(){
        DefaultTableModel model = (DefaultTableModel) organRequestJTable.getModel();
        
        model.setRowCount(0);
        for(int i=0;i<ecosystem.getWaitList().size();i++){
            if(ecosystem.getWaitList().get(i).getPatient().getDoctor().equalsIgnoreCase(userAccount.getEmployee().getEmployeeName())){
                Object[] row = new Object[5];
                row[0] = ecosystem.getWaitList().get(i).getPatient().getPatientId();
                row[1] = ecosystem.getWaitList().get(i).getPatient().getPatientName();
                row[2] = ecosystem.getWaitList().get(i).getOrgan();
                row[3] = ecosystem.getWaitList().get(i).getUrgency();
                row[4] = ecosystem.getWaitList().get(i).getWaitlist();   
                model.addRow(row);
            }
        }
    
    }
    

    public void LoadRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tbl_workRequest.getModel();
        model.setRowCount(0);

        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request instanceof DiagnosticsWorkRequest){
                Object[] row = new Object[6];
                row[0] = ((DiagnosticsWorkRequest) request).getPatient().getPatientId();
                row[1] = ((DiagnosticsWorkRequest) request).getPatient().getPatientName();
                row[2] = request;
                row[3] = request.getReceiver();
                row[4] = request.getStatus();
    
            int counter=0;
            for(Network n: ecosystem.getNetworkList()){
                for(Enterprise e: n.getEnterpriseList().getEnterpriseList()){
                    if(e instanceof PhysioEnterprise){
                        for(Organization o:e.getOrganizationDirectory().getListOfOrganizations()){
                            for(WorkRequest w:o.getWorkQueue().getWorkRequestList()){
                                if(((TherapistWorkRequest)w).getPatient().getPatientId()==((DiagnosticsWorkRequest) request).getPatient().getPatientId()){
                                    counter=counter+1;
                                    if(((TherapistWorkRequest)w).getReceiver()==null){
                                       row[5] = "Not Assigned yet"; 
                                    }else{
                                        row[5]=((TherapistWorkRequest)w).getReceiver();
                                    }
                                }
                            }    
                        }
                    }
                }    
            }
            if(counter==0){
                row[5] = "Not requested yet"; 
            }   
                model.addRow(row);
            }
        }
    }

    public void initwaitlistTable(){
        DefaultTableModel model = (DefaultTableModel) organRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request instanceof DiagnosticsWorkRequest){
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = ((DiagnosticsWorkRequest) request).getPatient().getPatientName();
                row[2] = request.getReceiver();
                row[3] = request.getStatus();
                String result = ((DiagnosticsWorkRequest) request).getTestResult();
                row[4] = result == null ? "Waiting" : result;
                model.addRow(row);
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

        jPopupMenu2 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_workRequest = new javax.swing.JTable();
        btn_request_Test = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        organRequestJTable = new javax.swing.JTable();
        btn_request_organ = new javax.swing.JButton();
        lbl_select_patient = new javax.swing.JLabel();
        comboBox_patients = new javax.swing.JComboBox();
        lblAge = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        btn_view = new javax.swing.JButton();
        lbl_doctor_dashboard = new javax.swing.JLabel();
        lbl_patient_details = new javax.swing.JLabel();
        txt_patient_age = new javax.swing.JTextField();
        txt_patient_name = new javax.swing.JTextField();
        btn_view_patients = new javax.swing.JButton();
        lbl_list_of_patients = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_notify_organ = new javax.swing.JButton();
        chk_heart = new javax.swing.JCheckBox();
        chk_kidney = new javax.swing.JCheckBox();
        chk_liver = new javax.swing.JCheckBox();
        chk_pancreas = new javax.swing.JCheckBox();
        btn_therapist = new javax.swing.JButton();
        chk_lungs = new javax.swing.JCheckBox();
        chk_intestines = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);

        tbl_workRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Patient Name", "Message by Doctor", "Lab Assistant", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_workRequest);

        btn_request_Test.setBackground(new java.awt.Color(0, 102, 153));
        btn_request_Test.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btn_request_Test.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/purchase_order_24px.png"))); // NOI18N
        btn_request_Test.setText("Order test");
        btn_request_Test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_request_TestActionPerformed(evt);
            }
        });

        organRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "Organ Required", "Urgency", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(organRequestJTable);
        if (organRequestJTable.getColumnModel().getColumnCount() > 0) {
            organRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            organRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            organRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            organRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            organRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        btn_request_organ.setBackground(new java.awt.Color(0, 102, 153));
        btn_request_organ.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btn_request_organ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/request_service_24px.png"))); // NOI18N
        btn_request_organ.setText("Request Organ");
        btn_request_organ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_request_organActionPerformed(evt);
            }
        });

        lbl_select_patient.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lbl_select_patient.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_select_patient.setText("Select Patient:");

        comboBox_patients.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        comboBox_patients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_patientsActionPerformed(evt);
            }
        });

        lblAge.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAge.setText("Age:");

        lblName1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblName1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblName1.setText("Name:");

        btn_view.setBackground(new java.awt.Color(0, 102, 153));
        btn_view.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btn_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view.png"))); // NOI18N
        btn_view.setText("View Test Report");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });

        lbl_doctor_dashboard.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lbl_doctor_dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_doctor_dashboard.setText("DOCTOR DASHBOARD");

        lbl_patient_details.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        lbl_patient_details.setText("Patient details - ");

        txt_patient_age.setEditable(false);
        txt_patient_age.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        txt_patient_name.setEditable(false);
        txt_patient_name.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txt_patient_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_patient_nameActionPerformed(evt);
            }
        });

        btn_view_patients.setBackground(new java.awt.Color(0, 102, 153));
        btn_view_patients.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btn_view_patients.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view.png"))); // NOI18N
        btn_view_patients.setText("View");
        btn_view_patients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_view_patientsActionPerformed(evt);
            }
        });

        lbl_list_of_patients.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        lbl_list_of_patients.setText("List of Old patients and test results");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setText("Your Patients waiting for Organs");

        btn_notify_organ.setBackground(new java.awt.Color(0, 102, 153));
        btn_notify_organ.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btn_notify_organ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/notification_24px.png"))); // NOI18N
        btn_notify_organ.setText("Notify  organ");
        btn_notify_organ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_notify_organActionPerformed(evt);
            }
        });

        chk_heart.setText("Heart");

        chk_kidney.setText("Kidneys");

        chk_liver.setText("Liver");

        chk_pancreas.setText("Pancreas");

        btn_therapist.setBackground(new java.awt.Color(0, 102, 153));
        btn_therapist.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btn_therapist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/physical_therapy_26px.png"))); // NOI18N
        btn_therapist.setText("Therapist");
        btn_therapist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_therapistActionPerformed(evt);
            }
        });

        chk_lungs.setText("Lungs");
        chk_lungs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_lungsActionPerformed(evt);
            }
        });

        chk_intestines.setText("Intestines");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(lbl_doctor_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_patient_details)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_select_patient)
                                .addGap(4, 4, 4)
                                .addComponent(comboBox_patients, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_view_patients, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_list_of_patients)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_view)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_request_organ, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(57, 57, 57)
                                    .addComponent(btn_therapist)
                                    .addGap(53, 53, 53)
                                    .addComponent(btn_notify_organ)
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(chk_heart)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(2, 2, 2)
                                                    .addComponent(chk_liver)))
                                            .addGap(24, 24, 24)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(chk_pancreas)
                                                .addComponent(chk_kidney)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(chk_lungs)
                                            .addGap(18, 18, 18)
                                            .addComponent(chk_intestines))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn_request_Test, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblName1)
                                                .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(10, 10, 10)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt_patient_age, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_patient_name, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addGap(5, 5, 5))))))
                .addContainerGap(252, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_notify_organ, btn_request_Test, btn_request_organ, btn_therapist, btn_view});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbl_doctor_dashboard)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lbl_select_patient))
                            .addComponent(comboBox_patients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_view_patients, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_patient_details)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName1)
                                .addGap(18, 18, 18)
                                .addComponent(lblAge))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txt_patient_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txt_patient_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addComponent(btn_request_Test, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_list_of_patients)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_view)
                        .addComponent(btn_request_organ)
                        .addComponent(btn_notify_organ)
                        .addComponent(btn_therapist))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_heart)
                            .addComponent(chk_kidney))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chk_liver)
                            .addComponent(chk_pancreas))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_lungs)
                    .addComponent(chk_intestines))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_notify_organ, btn_request_organ, btn_therapist, btn_view});

    }// </editor-fold>//GEN-END:initComponents

    private void btn_request_TestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_request_TestActionPerformed

        
        String string = comboBox_patients.getSelectedItem().toString();
        String[] parts = string.split(":");
        String id = parts[0].trim();

        RequestLabTestJPanel rlt=new RequestLabTestJPanel(userProcessContainer, userAccount,patAccount(id),enterprise,organization, ecosystem,network);
        userProcessContainer.add("Lab test",rlt);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btn_request_TestActionPerformed
    public Patients patAccount(String id){
        for(Patients p: organization.getPatientDirectory().getListOfPatient()){
            if((""+id).equalsIgnoreCase(""+p.getPatientId())){
                System.out.println(p);
                return p;
            }
        }
        return null;
    }
    private void btn_request_organActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_request_organActionPerformed
        // TODO add your handling code here:
        boolean check;
        check=tbl_workRequest.getSelectedRow()>-1;
        if(!check){
            JOptionPane.showMessageDialog(null, "Select a patient");
            return;
        }

        Patients p=patAccount(tbl_workRequest.getValueAt(tbl_workRequest.getSelectedRow(), 0).toString());        
        RequestOrganJpanel tdj=new RequestOrganJpanel(userProcessContainer,organization, userAccount,p,ecosystem,enterprise,network);
        userProcessContainer.add("Lab test",tdj);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_btn_request_organActionPerformed

    private void comboBox_patientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_patientsActionPerformed

    }//GEN-LAST:event_comboBox_patientsActionPerformed

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        boolean check;
        check=tbl_workRequest.getSelectedRow()>-1;
        if(!check){
            JOptionPane.showMessageDialog(null, "Select a patient");
            return;
        }
        
        Patients p=patAccount(tbl_workRequest.getValueAt(tbl_workRequest.getSelectedRow(), 0).toString());
        
        String id=tbl_workRequest.getValueAt(tbl_workRequest.getSelectedRow(), 0).toString();
        
        check=!(tbl_workRequest.getValueAt(tbl_workRequest.getSelectedRow(), 3)==null);
        if(!check){
            JOptionPane.showMessageDialog(null, "Resulted not generated");
            return;
        }
        
        String labassist=tbl_workRequest.getValueAt(tbl_workRequest.getSelectedRow(), 3).toString();
        
        TestDataJPanel tdj=new TestDataJPanel(userProcessContainer, userAccount,id,p,labassist,enterprise,organization, ecosystem,network);
        userProcessContainer.add("Lab test",tdj);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
        
        
    }//GEN-LAST:event_btn_viewActionPerformed

    private void txt_patient_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_patient_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_patient_nameActionPerformed

    private void btn_view_patientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_view_patientsActionPerformed
        // TODO add your handling code here:
        boolean check;
        check=comboBox_patients.getSelectedIndex()>0;
        if(!check){
            JOptionPane.showMessageDialog(null, "Select a patient");
        }
        String string = comboBox_patients.getSelectedItem().toString();
        String[] parts = string.split(":");
        String id = parts[0].trim();
        for(Patients p: organization.getPatientDirectory().getListOfPatient()){
            if(id.equalsIgnoreCase(""+p.getPatientId())){
                
                lblAge.setVisible(true);
                lblName1.setVisible(true);
                txt_patient_name.setVisible(true);
                txt_patient_age.setVisible(true);
                txt_patient_age.setText(p.getPatientAge());
                txt_patient_name.setText(p.getPatientName());
                txt_patient_age.setEnabled(false);
                txt_patient_name.setEnabled(false);
                btn_request_Test.setVisible(true);
            
            }
        }
    }//GEN-LAST:event_btn_view_patientsActionPerformed

    private void btn_notify_organActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_notify_organActionPerformed
        // TODO add your handling code here:
        boolean check;
        check=tbl_workRequest.getSelectedRow()>-1;
        if(!check){
            JOptionPane.showMessageDialog(null, "Select a patient");
            return;
        }
        check=(chk_heart.isSelected()||chk_kidney.isSelected()||chk_liver.isSelected()||chk_pancreas.isSelected()||chk_lungs.isSelected()||chk_intestines.isSelected());
        if(!check){
            JOptionPane.showMessageDialog(null, "Select atleast one checkbox");
            return;
        }
        
        
        OrganProcureWorkRequest request = new OrganProcureWorkRequest();
        request.setPatientAccount(patAccount(tbl_workRequest.getValueAt(tbl_workRequest.getSelectedRow(), 0).toString()));
        
        OrganMatchWorkRequest mr=new OrganMatchWorkRequest();
        mr.setDonpatient(patAccount(tbl_workRequest.getValueAt(tbl_workRequest.getSelectedRow(), 0).toString()));
        
        
        ArrayList<String> orList=new ArrayList<>();
        if(chk_heart.isSelected()){
            orList.add("Heart");
        }
        if(chk_kidney.isSelected()){
            orList.add("Kidney");
        }
        if(chk_liver.isSelected()){
            orList.add("Liver");
        }
        if(chk_pancreas.isSelected()){
            orList.add("Pancreas");
        }
        if(chk_pancreas.isSelected()){
            orList.add("Lungs");
        }
        if(chk_pancreas.isSelected()){
            orList.add("Intestines");
        }
        request.setOrganList(orList);
        
        Patients chkpat=patAccount(tbl_workRequest.getValueAt(tbl_workRequest.getSelectedRow(), 0).toString());
        int dup=0;
        for(Network n:ecosystem.getNetworkList()){
            for(Enterprise e: n.getEnterpriseList().getEnterpriseList()){
                if(e instanceof OrganBankEnterprise){
                    for(WorkRequest w: e.getWorkQueue().getWorkRequestList()){
                        if(w instanceof OrganProcureWorkRequest){
                            if(((OrganProcureWorkRequest) w).getPatient().getPatientId()==chkpat.getPatientId()){
                                dup=dup+1;
                            }
                        }
                    }
                
                }
            
            }
        }
        
        check=(dup==0);
        if(!check){
            JOptionPane.showMessageDialog(null, "The procurement for this patient is already requested");
            return;
        }

        request.setSender(userAccount);
        request.setStatus("Procurement Requested");
        
        mr.setStatus("Procurement Requested");
        mr.setSender(userAccount);
        
        int size=ecosystem.getWaitList().size();
        int loopcounter=0;
        for(int i=size-1;i>-1;i--){
            for(String s: orList){
                if(s.equalsIgnoreCase(ecosystem.getWaitList().get(i).getOrgan())){
                    loopcounter++;
                    mr.setRecpatient(ecosystem.getWaitList().get(i).getPatient());
                    mr.setOrgan(ecosystem.getWaitList().get(i).getOrgan());
                    break;
                }
            } 
            if(loopcounter>0)break;
        }
        
        
        Enterprise ent = null;
        for(Network n: ecosystem.getNetworkList()){
            if(n.getName().equalsIgnoreCase(network.getName())){
                for(Enterprise e: n.getEnterpriseList().getEnterpriseList()){
                    if(e instanceof OrganBankEnterprise){
                        ent=e;
                        if(loopcounter>0){
                            ent.getWorkQueue().getWorkRequestList().add(mr);
                            userAccount.getWorkQueue().getWorkRequestList().add(mr);
                        }else{
                            ent.getWorkQueue().getWorkRequestList().add(request);
                            userAccount.getWorkQueue().getWorkRequestList().add(request);
                        }
                        
                    }
                }
            
            }
            
        }
   
        JOptionPane.showMessageDialog(null, "Organ Procurement Requested");
        
        
    }//GEN-LAST:event_btn_notify_organActionPerformed

    private void btn_therapistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_therapistActionPerformed
        // TODO add your handling code here:
        boolean check;
        check=tbl_workRequest.getSelectedRow()>-1;
        if(!check){
            JOptionPane.showMessageDialog(null, "Select a patient");
            return;
        }
        Patients p=patAccount(tbl_workRequest.getValueAt(tbl_workRequest.getSelectedRow(), 0).toString());
        RequestTherapyJPanel tdj=new RequestTherapyJPanel(userProcessContainer,organization, userAccount,p,ecosystem,enterprise,network);
        userProcessContainer.add("Lab test",tdj);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btn_therapistActionPerformed

    private void chk_lungsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_lungsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_lungsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_notify_organ;
    private javax.swing.JButton btn_request_Test;
    private javax.swing.JButton btn_request_organ;
    private javax.swing.JButton btn_therapist;
    private javax.swing.JButton btn_view;
    private javax.swing.JButton btn_view_patients;
    private javax.swing.JCheckBox chk_heart;
    private javax.swing.JCheckBox chk_intestines;
    private javax.swing.JCheckBox chk_kidney;
    private javax.swing.JCheckBox chk_liver;
    private javax.swing.JCheckBox chk_lungs;
    private javax.swing.JCheckBox chk_pancreas;
    private javax.swing.JComboBox comboBox_patients;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lbl_doctor_dashboard;
    private javax.swing.JLabel lbl_list_of_patients;
    private javax.swing.JLabel lbl_patient_details;
    private javax.swing.JLabel lbl_select_patient;
    private javax.swing.JTable organRequestJTable;
    private javax.swing.JTable tbl_workRequest;
    private javax.swing.JTextField txt_patient_age;
    private javax.swing.JTextField txt_patient_name;
    // End of variables declaration//GEN-END:variables
}
