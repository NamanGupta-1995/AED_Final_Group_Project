/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author garima
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> listOfEnterprise;
   

    public ArrayList<Enterprise> getListOfEnterprise() {
        return listOfEnterprise;
    }

    public void setListOfEnterprise(ArrayList<Enterprise> enterpriseList) {
        this.listOfEnterprise = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        listOfEnterprise=new ArrayList<Enterprise>();
    }
    
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterpriseName = null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterpriseName = new EnterpriseHospital(name);
            listOfEnterprise.add(enterpriseName);
        }else if (type==Enterprise.EnterpriseType.OrganBank){
            enterpriseName = new EnterpriseOrganBank(name);
            listOfEnterprise.add(enterpriseName);    
        }else if(type==Enterprise.EnterpriseType.Government){
            enterpriseName = new EnterpriseGovernment(name);
            listOfEnterprise.add(enterpriseName);    
        }else if(type==Enterprise.EnterpriseType.Therapy){
            enterpriseName = new EnterpriseTherapy(name);
            listOfEnterprise.add(enterpriseName);    
        }
        return enterpriseName;
    }
}
