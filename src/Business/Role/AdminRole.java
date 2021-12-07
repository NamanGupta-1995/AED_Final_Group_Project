/*
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Person.DonorDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.AdministrativeRole.HospitalAdminJPanel;
import userinterface.AdministrativeRole.OrganBankJPanel;

/**
 *
 * @author GarimaC
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network, DonorDirectory donorDirectory) {
        JPanel jp;
        if(enterprise.getClass().getTypeName().contains("HospitalEnterprise")){
            jp=new HospitalAdminJPanel(userProcessContainer, enterprise, business,network);
        }
        else if(enterprise.getClass().getTypeName().contains("OrganBankEnterprise")){
            jp=new OrganBankJPanel (userProcessContainer, enterprise, business,network);
        }
        else{
            jp=new AdminWorkAreaJPanel(userProcessContainer, enterprise, business,network);
        }
        return jp;
    }

}
