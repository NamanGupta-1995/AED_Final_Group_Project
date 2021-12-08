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
public class AwarnessCampaign extends Organization {

    public AwarnessCampaign(String campName){
        super(campName);

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new EventOrganizer());
        return role;
    }
    
    @Override
    public Type getOrgType() {
        return Organization.Type.AwarnessCampaign;
    } 
} 
