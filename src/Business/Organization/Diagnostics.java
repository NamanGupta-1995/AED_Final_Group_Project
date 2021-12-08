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
 * @author mrunal
 */
public class Diagnostics extends Organization{
    
    public Diagnostics(String diagName){
        super(diagName);

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new LabAssistant());
        return role;
    }
    
    @Override
    public Type getOrgType() {
        return Organization.Type.Diagnostics;
    } 
}
