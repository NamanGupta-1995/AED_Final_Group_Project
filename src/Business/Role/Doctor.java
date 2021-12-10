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
import Business.Organization.PhysioTherapist;
import Business.Person.DonorsDirectory;
import Business.Users.Users;
import javax.swing.JPanel;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;
import static Business.Organization.Organization.getRole.HealthCare;

/**
 *
 * @author Garima
 */
public class Doctor extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Users account, Organization organization, Enterprise enterprise, EcoSystem business,Network network, DonorsDirectory donorDirectory) {
        return new DoctorWorkAreaJPanel(userProcessContainer,account, (HealthCare)organization, enterprise,business, network);
    }
    
}
