/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EventOrganizer;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author garima
 */
public class AwarnessEvent extends Organization {

   public AwarnessEvent(String name){
        super(name);

    }

   @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EventOrganizer());
        return roles;
    }
    
    @Override
    public Type getOrgType() {
        return Organization.Type.AwarnessEvent;
    } 

} 
