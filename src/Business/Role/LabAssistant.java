/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Laboratory;
import Business.Organization.Organization;
import Business.Organization.PhysioTherapist;
import Business.Person.DonorsDirectory;
import Business.Users.Users;
import javax.swing.JPanel;
import userinterface.LabAssistantRole.DiagnosticsWorkArea;
import userinterface.PhysioTherapistRole.PhysioTherapistWorkAreaJPanel;

/**
 *
 * @author garima
 */
public class LabAssistant extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Users userAccount, Organization organization, Enterprise enterprise, EcoSystem ecosystem, Network network, 
            DonorsDirectory donorDirectory) {
         return new DiagnosticsWorkArea(userProcessContainer, userAccount, (Laboratory)organization,ecosystem,enterprise);
    }
    
}
