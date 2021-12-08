/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HealthOfficier;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author garima
 */
public class PoliciesAndFinance extends Organization {

    public PoliciesAndFinance(String policyFinName){
        super(policyFinName);

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new HealthOfficier());
        return role;
    }
    
    @Override
    public Type getOrgType() {
        return Organization.Type.PoliciesFinance;
    } 
    
    
}
