/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Person.DonorDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organ.Organ;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author garima
 */
public abstract class Role {
    
    public enum RoleType{
       Sysadmin("Syadmin") ,
       Admin("Admin"),
       Doctor("Doctor"),
       LabTechnician("Lab Technician"),
       ProcurementTeamHead("Procurement Team Head"),
       HealthOfficer("Health Officer"),
       EventOrganiser("Event Organiser"),
       Donor("Donor"),
       OrganBankManager("Organ Bank Manager"),
       Therapist("Therapist");
       
        private String value;

        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,
            Network network,
            DonorDirectory donorDirectory);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}