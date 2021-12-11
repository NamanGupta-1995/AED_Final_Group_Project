/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Person.DonorsDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AwarnessEvent;
import Business.Organization.Organization;
import Business.Users.Users;
import javax.swing.JPanel;
import userinterface.EventsOrganizerRole.EventOrganizerWorkAreaJPanel;

/**
 *
 * @author garima
 */
public class EventCommittee extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Users userAccount, Organization org, Enterprise enterprise, EcoSystem ecosystem,
            Network network, DonorsDirectory donorDirectory) {
        return new EventOrganizerWorkAreaJPanel(userProcessContainer, userAccount,(AwarnessEvent) org, ecosystem);
    }
    
}
