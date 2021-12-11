/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.Donors;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Waitlist.Wait;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author namangupta
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private ArrayList<Donors> donorDirectory;
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
    
     public Donors createDonor(String name, int age, String sex, String bloodGroup, String contactNum, String address,
                String emailAdd, String emergencyPOC, String emergencyPOC_Num, boolean isOrganAvaiNow,List<String >organs){
        
        Donors donor = new Donors();
        donor.setDonorName(name);
        donor.setDonorAge(age);
        donor.setDonorGender(sex);
        donor.setDonorBloodGroup(bloodGroup);
        donor.setContact(contactNum);
        donor.setDonorAddress(address);
        donor.setEmail(emailAdd);
        donor.setpName(emergencyPOC);
        donor.setpContact(emergencyPOC_Num);
        donor.setOrganList(organs);
        donorDirectory.add(donor);
        return donor;
    }
    
    public ArrayList<Donors> getDonorDirectory() {
        return donorDirectory;
    }

    public void setDonorDirectory(ArrayList<Donors> donorDirectory) {
        this.donorDirectory = donorDirectory;
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
        networkList.add(network);
        return network;
    }
    
    public Network getNetworkByName(String networkName){
        for(Network network:networkList){
            if(network.getName().equals(networkName)){
                return network;
            }
        }
        return null;
    }
    
    public void deleteNetwork(Network network){
        networkList.remove(network);
    }
    
    @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
        donorDirectory = new ArrayList<Donors>();
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
        JOptionPane.showMessageDialog(null, "Patient is added to the national waitlist");
    }
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        
        //todo
        for(Network network:networkList){
            
        }
        return true;
    }
    
    
    
}
