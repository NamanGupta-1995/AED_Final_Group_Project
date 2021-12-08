/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ProcurementTeam;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author garima
 */
public class Facilities extends Organization{
    
    public Facilities(String facName){
        super(facName);

    }
    int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new ProcurementTeam());
        return role;
    }
    
    @Override
    public Type getOrgType() {
        return Organization.Type.Facilities;
    } 
} 