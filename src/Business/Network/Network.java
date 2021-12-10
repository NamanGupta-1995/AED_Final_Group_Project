/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author namangupta
 */
public class Network {
    
    private String name;
    private EnterpriseDirectory enterpriseList;
    
    public Network(){
        enterpriseList=new EnterpriseDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseList() {
        return enterpriseList;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
