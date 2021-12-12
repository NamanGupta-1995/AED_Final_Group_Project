/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CreateAdmin;

import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.OrganBankEnterprise;
import Business.Enterprise.NGOEnterprise;
import Business.Enterprise.PhysioEnterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.getRole;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author namangupta
 */
public class OrganizationManagementJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDirectory;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public OrganizationManagementJPanel(JPanel userProcessContainer,OrganizationDirectory directory,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory = directory;
        this.enterprise= enterprise;
        
        initTable();
        initComboBox();
    }
    
    private void initComboBox(){
        cmbxOrganizationType.removeAllItems();
        cmbxOrganizationType.addItem("--Select--");
        for (getRole type : Organization.getRole.values()){
            
             if(enterprise instanceof HospitalEnterprise){
                 if(type.toString().equals("HealthCare") || type.toString().equals("Diagnostics")){
                 cmbxOrganizationType.addItem(type);}
             }
             if(enterprise instanceof OrganBankEnterprise){
                 if(type.toString().equals("Facilities")){
                 cmbxOrganizationType.addItem(type);}
                 
             }
             if(enterprise instanceof NGOEnterprise){
                 if(type.toString().equals("PoliciesFinance")|| type.toString().equals("AwarnessEvent")){
                 cmbxOrganizationType.addItem(type);}
                 
             }
             if(enterprise instanceof PhysioEnterprise){
                 if(type.toString().equals("Physio")){
                 cmbxOrganizationType.addItem(type);}
                 
             }
                
            
        }
    }

    private void initTable(){
        DefaultTableModel model = (DefaultTableModel) tblCurrentOrganizations.getModel();
        model.setRowCount(0);
        for (Organization organization : organizationDirectory.getListOfOrganizations()){
            Object[] row = new Object[2];
            row[0] = organization.getOrgName();
            row[1]= organization.getOrgType().getValue();
            
            model.addRow(row);
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

        tblOrganization = new javax.swing.JScrollPane();
        tblCurrentOrganizations = new javax.swing.JTable();
        btnCreateOrganization = new javax.swing.JButton();
        cmbxOrganizationType = new javax.swing.JComboBox();
        lblOrganizationType = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblCreateOrganization = new javax.swing.JLabel();
        lblPresentOrganization = new javax.swing.JLabel();
        lblOrganizationName = new javax.swing.JLabel();
        txtOrganizationName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        tblCurrentOrganizations.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblCurrentOrganizations.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tblCurrentOrganizations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organisation Name", "Organisation Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrganization.setViewportView(tblCurrentOrganizations);
        if (tblCurrentOrganizations.getColumnModel().getColumnCount() > 0) {
            tblCurrentOrganizations.getColumnModel().getColumn(0).setResizable(false);
            tblCurrentOrganizations.getColumnModel().getColumn(1).setResizable(false);
        }

        btnCreateOrganization.setBackground(new java.awt.Color(255, 0, 51));
        btnCreateOrganization.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnCreateOrganization.setText("Add Organization");
        btnCreateOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateOrganizationActionPerformed(evt);
            }
        });

        cmbxOrganizationType.setBackground(new java.awt.Color(255, 0, 51));
        cmbxOrganizationType.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        cmbxOrganizationType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblOrganizationType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblOrganizationType.setForeground(new java.awt.Color(255, 0, 51));
        lblOrganizationType.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblOrganizationType.setText("Organization Type :");

        btnBack.setBackground(new java.awt.Color(255, 0, 51));
        btnBack.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblCreateOrganization.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblCreateOrganization.setForeground(new java.awt.Color(255, 0, 51));
        lblCreateOrganization.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateOrganization.setText("CREATE ORGANIZATION");

        lblPresentOrganization.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPresentOrganization.setForeground(new java.awt.Color(255, 0, 51));
        lblPresentOrganization.setText("Current Organizations");

        lblOrganizationName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblOrganizationName.setForeground(new java.awt.Color(255, 0, 51));
        lblOrganizationName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblOrganizationName.setText("Organization Name :");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/animation_300_kx18v4yc.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCreateOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblOrganizationName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblOrganizationType, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbxOrganizationType, 0, 234, Short.MAX_VALUE)
                                    .addComponent(txtOrganizationName)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(btnCreateOrganization))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPresentOrganization)
                                    .addComponent(tblOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 326, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCreateOrganization)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbxOrganizationType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrganizationType))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOrganizationName)
                            .addComponent(txtOrganizationName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCreateOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPresentOrganization)
                        .addGap(18, 18, 18)
                        .addComponent(tblOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(480, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateOrganizationActionPerformed

        boolean selected;
        selected=cmbxOrganizationType.getSelectedIndex()>0;
        if(!selected){
            JOptionPane.showMessageDialog(null, "Select an Organisation");
        }
        
        getRole type = (getRole) cmbxOrganizationType.getSelectedItem();
        organizationDirectory.createOrganization(type,txtOrganizationName.getText());
        txtOrganizationName.setText("");
        initTable();
    }//GEN-LAST:event_btnCreateOrganizationActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateOrganization;
    private javax.swing.JComboBox cmbxOrganizationType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCreateOrganization;
    private javax.swing.JLabel lblOrganizationName;
    private javax.swing.JLabel lblOrganizationType;
    private javax.swing.JLabel lblPresentOrganization;
    private javax.swing.JTable tblCurrentOrganizations;
    private javax.swing.JScrollPane tblOrganization;
    private javax.swing.JTextField txtOrganizationName;
    // End of variables declaration//GEN-END:variables
}
