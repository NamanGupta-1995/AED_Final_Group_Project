/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Medical;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Medical;
import Business.Organization.Therapists;
import Business.Person.DonorDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;

/**
 *
 * @author GarimaC
 */
public class Doctor extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network, DonorDirectory donorDirectory) {
        return new DoctorWorkAreaJPanel(userProcessContainer,account, (Medical)organization, enterprise,business, network);
    }
    
}
