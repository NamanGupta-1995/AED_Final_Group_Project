/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.OrganFindingTeam;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author namangupta
 */
public class OrganOffice extends Organization {

    public OrganOffice(String name){
        super(name);

    }

    @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new OrganFindingTeam());
        return roles;
    }
    @Override
    public getRole getOrgType() {
        return Organization.getRole.OrganManagement;
    } 
}

