/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TherapistRole;
import java.util.ArrayList;

/**
 *
 * @author garima
 */
public class Therapists extends Organization{
    
    public Therapists(String therapyName){
        super(therapyName);

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new TherapistRole());
        return role;
    }
    
    @Override
    public Type getOrgType() {
        return Organization.Type.Therapist;
    } 
    
    
}
