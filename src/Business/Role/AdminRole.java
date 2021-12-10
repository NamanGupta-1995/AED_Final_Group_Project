/*
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Person.DonorsDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Users.Users;
import javax.swing.JOptionPane;
//import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
//import userinterface.AdministrativeRole.HospitalAdminJPanel;
//import userinterface.AdministrativeRole.OrganBankJPanel;

/**
 *
 * @author GarimaC
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Users account, Organization organization, Enterprise enterprise, EcoSystem business,Network network, DonorsDirectory donorDirectory) {
        JPanel jp = null;
        if(enterprise.getClass().getTypeName().contains("HospitalEnterprise")){
            //jp=new HospitalAdminJPanel(userProcessContainer, enterprise, business,network);
        }
        else if(enterprise.getClass().getTypeName().contains("OrganBankEnterprise")){
            //jp=new OrganBankJPanel (userProcessContainer, enterprise, business,network);
        }
        else{
            //jp=new AdminWorkAreaJPanel(userProcessContainer, enterprise, business,network);
        }
        return jp;
    }

}
