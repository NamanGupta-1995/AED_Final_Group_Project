/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Person.PatientDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author garima
 */
public abstract class Organization {

    private String orgName;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private PatientDirectory patientDirectory;
    private int organizationID;
    private static int count=0;
    private Type orgType;

    
    public enum Type{
        Medical("Medical"), 
        Diagnostics("Diagnostics"), 
        Facilities("Facilities"),
        OrganManagement("Organ Management"),
        PoliciesFinance("Policies and Finance"),
        AwarnessCampaign("Awarness Campaign"),
        User("User"),
        Therapist("Therapist");
        
        private String orgValue;
        private Type(String value) {
            this.orgValue = value;
        }
        public String getOrgValue() {
            return orgValue;
        }
    }

    public Organization(String name) {
        this.orgName = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        patientDirectory=new PatientDirectory();
        organizationID = count;
        ++count;
    }

    public Type getOrgType() {
        return orgType;
    }

    public void setOrgType(Type orgType) {
        this.orgType = orgType;
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getOrgName() {
        return orgName;
    }
    
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    @Override
    public String toString() {
        return orgName;
    }
    
    
}
