/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import java.util.Date;

/**
 *
 * @author GarimaC
 */
public class Users {
    
   private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private String contact;
    private String userAddress;
    private String qualifications;
    private String profile;
    private int age;
    private String gender;
    private boolean userIsAvailable;
    private boolean userIsAvailableforOrganDonation;

    public boolean isUserIsAvailableforOrganDonation() {
        return userIsAvailableforOrganDonation;
    }

    public void setUserIsAvailableforOrganDonation(boolean userIsAvailableforOrganDonation) {
        this.userIsAvailableforOrganDonation = userIsAvailableforOrganDonation;
    }

    public boolean isUserIsAvailable() {
        return userIsAvailable;
    }

    public void setUserIsAvailable(boolean userIsAvailable) {
        this.userIsAvailable = userIsAvailable;
    }
    

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public Users() {
        workQueue = new WorkQueue();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return username;
    }
    
}