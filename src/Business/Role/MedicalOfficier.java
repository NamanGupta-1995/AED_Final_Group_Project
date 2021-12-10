/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.HealthCare;
import Business.Organization.Organization;
import Business.Organization.FinanceEvent;
import Business.Person.DonorsDirectory;
import Business.Users.Users;
import javax.swing.JPanel;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;
import userinterface.HealthOfficer.HealthOfficerJPanel;

/**
 *
 * @author namangupta
 */
public class MedicalOfficier extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Users userAccount, Organization org, Enterprise enterprise, EcoSystem ecosystem,
            Network network, DonorsDirectory donorDirectory) {
        return new HealthOfficerJPanel(userProcessContainer,userAccount,
                (FinanceEvent)org, enterprise,ecosystem, network);
    }
    
}
