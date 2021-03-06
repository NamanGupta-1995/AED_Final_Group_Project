/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Noordeep
 */
public class NetworkManagementJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    ArrayList<String> networkstring = new ArrayList<String>();
    /**
     *
     * Creates new form ManageNetworkJPanel
     */
    public NetworkManagementJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        addanewnetworks();
        LoadNetworkTable();
    }
    public void addanewnetworks(){
        for(Network n:system.getNetworkList()){
            networkstring.add(n.toString());
        }
    }

    private void LoadNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) tbl_list_of_network.getModel();
        //set the row count as zero on initial page load
        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            Object[] row = new Object[1];
            row[0] = network.getName();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_list_of_network = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_add_new_city = new javax.swing.JButton();
        txt_city_Name = new javax.swing.JTextField();
        btn_back_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbl_CitiesPresentInNetwork = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        tbl_list_of_network.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_list_of_network.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tbl_list_of_network.setForeground(new java.awt.Color(255, 0, 51));
        tbl_list_of_network.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Network"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_list_of_network.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tbl_list_of_network.setSelectionForeground(new java.awt.Color(255, 255, 51));
        jScrollPane1.setViewportView(tbl_list_of_network);
        if (tbl_list_of_network.getColumnModel().getColumnCount() > 0) {
            tbl_list_of_network.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Name:");

        btn_add_new_city.setBackground(new java.awt.Color(255, 0, 51));
        btn_add_new_city.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_add_new_city.setForeground(new java.awt.Color(255, 255, 255));
        btn_add_new_city.setText("Add City");
        btn_add_new_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_new_cityActionPerformed(evt);
            }
        });

        txt_city_Name.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        btn_back_button.setBackground(new java.awt.Color(255, 0, 51));
        btn_back_button.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_back_button.setForeground(new java.awt.Color(255, 255, 255));
        btn_back_button.setText("Back");
        btn_back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back_buttonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Network of Cities");

        lbl_CitiesPresentInNetwork.setBackground(new java.awt.Color(255, 255, 255));
        lbl_CitiesPresentInNetwork.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        lbl_CitiesPresentInNetwork.setForeground(new java.awt.Color(255, 0, 51));
        lbl_CitiesPresentInNetwork.setText("Cities present in network");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Add a city to the network");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/networl.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_city_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_add_new_city))))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_CitiesPresentInNetwork)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(302, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(txt_city_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_add_new_city, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_CitiesPresentInNetwork)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(89, 89, 89)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_add_new_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_new_cityActionPerformed

        int Flag=0;
        String name = txt_city_Name.getText();
        if (name.matches("^([A-Za-z]+)(\\s[A-Za-z]+)*\\s?$")) {
            name = name.trim();
            for(String s:networkstring){
                if(s.equalsIgnoreCase(name)){
                    JOptionPane.showMessageDialog(null, "Please add another city, the city already exists in the network");
                    Flag=1;
                    break;
                }
            }
            if(Flag==0){
            networkstring.add(name);
            Network network = system.createAndAddNetwork();
            network.setName(name);
            LoadNetworkTable();
            txt_city_Name.setText("");
            }    
        } else {
            //Throw a dialog box if a special character is used
            JOptionPane.showMessageDialog(null,"Invalid text, special chanracters not allowed");
        }
    }//GEN-LAST:event_btn_add_new_cityActionPerformed

    private void btn_back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back_buttonActionPerformed
        userProcessContainer.remove(this);
        Component[] ArrayofComponent = userProcessContainer.getComponents();
        Component component = ArrayofComponent[ArrayofComponent.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwJPanel = (SystemAdminWorkAreaJPanel) component;
        sysAdminwJPanel.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btn_back_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_new_city;
    private javax.swing.JButton btn_back_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_CitiesPresentInNetwork;
    private javax.swing.JTable tbl_list_of_network;
    private javax.swing.JTextField txt_city_Name;
    // End of variables declaration//GEN-END:variables
}
