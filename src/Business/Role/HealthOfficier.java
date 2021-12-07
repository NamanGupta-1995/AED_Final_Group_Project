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
import Business.Organization.PoliciesAndFinance;
import Business.Person.DonorDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;
import userinterface.HealthOfficer.HealthOfficerJPanel;

/**
 *
 * @author mruna
 */
public class HealthOfficier extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization org, Enterprise enterprise, EcoSystem ecosystem,
            Network network, DonorDirectory donorDirectory) {
        return new HealthOfficerJPanel(userProcessContainer,userAccount,
                (PoliciesAndFinance)org, enterprise,ecosystem, network);
    }
    
}
