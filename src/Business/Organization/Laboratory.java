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
 * @author namangupta
 */
public class Laboratory extends Organization{
    
    public Laboratory(String name){
        super(name);

    }

    @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabAssistant());
        return roles;
    }
    @Override
    public Organization.Type getOrgType() {
        return Organization.Type.Diagnostics;
    } 
}
