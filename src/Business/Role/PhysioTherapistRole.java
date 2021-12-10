/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PhysioTherapist;
import Business.Person.DonorsDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.TherapistRole.TherapistWorkAreaJPanel;

/**
 *
 * @author Garima
 */
public class PhysioTherapistRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, 
            Organization organization, Enterprise enterprise, 
            EcoSystem business, Network network, DonorsDirectory donorDirectory) {
         return new TherapistWorkAreaJPanel(userProcessContainer, userAccount, (PhysioTherapist)organization, enterprise,business, network);
    }
    
}
