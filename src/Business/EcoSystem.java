/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.Donors;

import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Waitlist.Wait;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author garima
 */
public class EcoSystem extends Organization{
    
    
    private static EcoSystem business;
    private ArrayList<Network> network;
    private ArrayList<Donors> donorsDirectory;
    private ArrayList<Wait> waitList;
    int patientId;
    int employeeId;
    int donorId;


    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
     public Donors createDonor(String name, int age, String gender, String bloodGroup, String contactNum, String address, String sign,
                String email, String emergencyPOCName, String emergencyPOCContact, boolean isOrganAvailableNow, List<String> organList){
        
        Donors d = new Donors();
        d.setDonorName(name);
        d.setDonorAge(age);
        d.setDonorGender(gender);
        d.setDonorBloodGroup(bloodGroup);
        d.setContact(contactNum);
        d.setDonorAddress(address);
        d.setSign(sign);
        d.setEmail(email);
        d.setpName(emergencyPOCName);
        d.setpContact(emergencyPOCContact);
        d.setOrganList(organList);
        donorsDirectory.add(d);
        return d;
    }
    
    public ArrayList<Donors> getDonorsDirectory() {
        return donorsDirectory;
    }

    public void setDonorsDirectory(ArrayList<Donors> donorsDirectory) {
        this.donorsDirectory = donorsDirectory;
    }
    
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    public int getPatientId() {
        return patientId;
    }
    public void incPatientId() {
        patientId++;
    }
    
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void incEmployeeId() {
        employeeId++;
    }
    
    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }
    public int getDonorId() {
        return donorId;
    }
    public void incDonorId() {
        donorId++;
    }
    
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        this.network.add(network);
        return network;
    }
    
    @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        network=new ArrayList<Network>();
          donorsDirectory = new ArrayList<Donors>();
        popDonor();
    }
    
    //todo
    void popDonor(){
        
    }

    public ArrayList<Wait> getWaitList() {
        return waitList;
    }

    public void setWaitList(ArrayList<Wait> waitList) {
        this.waitList = waitList;
    }
    public void addWaitlist(Wait w){
        waitList.add(w);
        JOptionPane.showMessageDialog(null, "Patient is added to the waitlist");
    }
    
    public ArrayList<Network> getNetwork() {
        return network;
    }

    public void setNetwork(ArrayList<Network> network) {
        this.network = network;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        
        return true;
    }
    
}
