/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Person.PatientsDirectory;
import Business.Role.Role;
import Business.Users.UsersDirectory;
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
    private UsersDirectory userAccountDirectory;
    private PatientsDirectory patientDirectory;
    private int orgID;
    private static int count=0;
    private getRole orgType;

    
    public enum getRole{
        HealthCare("Medical"), 
        Diagnostics("Diagnostics"), 
        Facilities("Facilities"),
        OrganManagement("Organ Management"),
        PoliciesFinance("Policies and Finance"),
        AwarnessEvent("Awarness Event"),
        User("User"),
        PhysioTherapist("Physio Therapist");
        
        private String value;
        
        private getRole(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.orgName = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UsersDirectory();
        patientDirectory=new PatientsDirectory();
        orgID = count;
        ++count;
    }

    public getRole getOrgType() {
        return orgType;
    }

    public void setOrgType(getRole orgType) {
        this.orgType = orgType;
    }
    
    public abstract ArrayList<Role> getRole();
    
    public UsersDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrgID() {
        return orgID;
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

    public PatientsDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientsDirectory patientDirectory) {
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
