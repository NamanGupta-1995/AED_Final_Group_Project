/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MedicalOfficier;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author garima
 */
public class FinanceEvent extends Organization {

    public FinanceEvent(String policyFinName){
        super(policyFinName);

    }

    @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new MedicalOfficier());
        return role;
    }
    
    @Override
    public getRole getOrgType() {
        return Organization.getRole.PoliciesFinance;
    } 
    
    
}
