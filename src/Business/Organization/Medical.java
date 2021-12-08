/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Doctor;
import Business.Role.LabAssistant;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author garima
 */
public class Medical extends Organization{
    
    public Medical(String medName){
        super(medName);

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new Doctor());
        return role;
    }
    
    @Override
    public Type getOrgType() {
        return Organization.Type.Medical;
    } 
} 