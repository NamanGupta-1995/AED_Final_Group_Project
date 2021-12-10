/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.PhysioTherapistRole;
import java.util.ArrayList;

/**
 *
 * @author garima
 */
public class PhysioTherapist extends Organization{
    
    public PhysioTherapist(String therapyName){
        super(therapyName);

    }

    @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new PhysioTherapistRole());
        return role;
    }
    
    @Override
    public getRole getOrgType() {
        return Organization.getRole.PhysioTherapist;
    } 
    
    
}
