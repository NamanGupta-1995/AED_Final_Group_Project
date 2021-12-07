/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Person.DonorDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AwarnessCampaign;
//import Business.Organization.AwarnessEventManagementOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.EventOrganizerRole.EventOrganizerWorkAreaJPanel;
//import userinterface.EventOrganizerRole.EventOrganizerWorkAreaJPanel;
//import userinterface.MedicalDirectorWorkArea.MedicalDirectorWorkAreaJPanel.MedicalDirectorWorkAreaJPanel;

/**
 *
 * @author garima
 */
public class EventOrganizer extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization org, Enterprise enterprise, EcoSystem ecosystem,
            Network network, DonorDirectory donorDirectory) {
        return new EventOrganizerWorkAreaJPanel(userProcessContainer, userAccount,(AwarnessCampaign) org, ecosystem);
    }
    
}
