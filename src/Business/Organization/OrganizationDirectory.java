/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.getRole;
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
    
    
    
    
     public Organization createOrganization(getRole type,String name){
        Organization org = null;
        if (type.getValue().equals(getRole.HealthCare.getValue())){
            org = new HealthCare(name);
            listOfOrganizations.add(org);
        }else if (type.getValue().equals(getRole.Diagnostics.getValue())){
            org = new Laboratory(name);
            listOfOrganizations.add(org);
        }else if (type.getValue().equals(getRole.Facilities.getValue())){
            org = new Facilities(name);
            listOfOrganizations.add(org);
        }else if (type.getValue().equals(getRole.OrganManagement.getValue())){
            org = new OrganOffice(name);
            listOfOrganizations.add(org);
        }else if(type.getValue().equals(getRole.PoliciesFinance.getValue())){
          org = new FinanceEvent(name);
          listOfOrganizations.add(org);
        }else if(type.getValue().equals(getRole.AwarnessEvent.getValue())){
             org = new AwarnessEvent(name);
            listOfOrganizations.add(org);
        }else if(type.getValue().equals(getRole.Physio.getValue())){
             org = new PhysioTherapist(name);
             listOfOrganizations.add(org);
        }
        return org;
    }
}
    
