/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author namangupta
 */
public class PhysioEnterprise extends Enterprise {
    
    public PhysioEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Physio);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
