/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Organ.Organ;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author garima
 */
public class Donors {
    private int donorID;
    private String donorName;
    private int donorAge;
    private String donorGender;
    private String donorBloodGroup;
    private String contact;
    private String donorAddress;
    private String donorCity;
    private String email;
    private String date;
    private String network;
    private String pName;
    private String pContact;
    private boolean isOrganAvailibility;
    List<String> organList;
    private ArrayList<Organ> organDirectory = new ArrayList<Organ>();

     public boolean getIsOrganAvailableNow() {
        return isOrganAvailibility;
    }

    public void setIsOrganAvailibility(boolean isOrganAvailibility) {
        this.isOrganAvailibility = isOrganAvailibility;
    }
    
    public List<String> getOrganList() {
        return organList;
    }

    public void setOrganList(List<String> organList) {
        this.organList = organList;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpContact() {
        return pContact;
    }
    
    public int getDonorID() {
        return donorID;
    }

    public void setDonorID(int donorID) {    
        this.donorID = donorID;
    }

    public void setpContact(String pContact) {
        this.pContact = pContact;
    }
    
    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public String getDonorCity() {
        return donorCity;
    }

    public void setDonorCity(String donorCity) {
        this.donorCity = donorCity;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public int getDonorAge() {
        return donorAge;
    }

    public void setDonorAge(int donorAge) {
        this.donorAge = donorAge;
    }

    public String getDonorGender() {
        return donorGender;
    }
    
    public void setDonorGender(String donorGender) {
        this.donorGender = donorGender;
    }
    
    public String getDonorBloodGroup() {
        return donorBloodGroup;
    }

    public void setDonorBloodGroup(String donorBloodGroup) {
        this.donorBloodGroup = donorBloodGroup;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDonorAddress() {
        return donorAddress;
    }

    public void setDonorAddress(String donorAddress) {
        this.donorAddress = donorAddress;
    }
    
    @Override
    public String toString() {
        return this.getDonorName();
    }
}
