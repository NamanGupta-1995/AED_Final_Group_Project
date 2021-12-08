/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author garima
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> listOfOrganizations;

    public OrganizationDirectory() {
        listOfOrganizations = new ArrayList();
    }

    public ArrayList<Organization> getListOfOrganizations() {
        return listOfOrganizations;
    }
    
    
    
    
     public Organization createOrganization(Type type,String name){
        Organization org = null;
        if (type.getValue().equals(Type.Medical.getValue())){
            org = new Medical(name);
            listOfOrganizations.add(org);
        }else if (type.getValue().equals(Type.Diagnostics.getValue())){
            org = new Diagnostics(name);
            listOfOrganizations.add(org);
        }else if (type.getValue().equals(Type.Facilities.getValue())){
            org = new Facilities(name);
            listOfOrganizations.add(org);
        }else if (type.getValue().equals(Type.OrganManagement.getValue())){
            org = new OrganManagement(name);
            listOfOrganizations.add(org);
        }else if(type.getValue().equals(Type.PoliciesFinance.getValue())){
          org = new PoliciesAndFinance(name);
          listOfOrganizations.add(org);
        }else if(type.getValue().equals(Type.AwarnessCampaign.getValue())){
             org = new AwarnessCampaign(name);
            listOfOrganizations.add(org);
        }else if(type.getValue().equals(Type.Therapist.getValue())){
             org = new Therapists(name);
             listOfOrganizations.add(org);
        }
        return org;
    }
}
    
