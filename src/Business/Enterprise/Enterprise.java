/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author garima
 */
public abstract class Enterprise extends Organization{
     private EnterpriseType type;
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        OrganBank("Organ Bank"),
        Government("Government"),
        Therapy("Therapy");

        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return type;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.type = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.type = type;
        organizationDirectory=new OrganizationDirectory();
    }
}
