/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author garima
 */
public class DonorsDirectory {
    
    private ArrayList<Donors> donorsList;

    public DonorsDirectory() {
        donorsList = new ArrayList();
        ArrayList <String> organs = new ArrayList<String>();
        organs.add("Heart");
        organs.add("Lungs");
        organs.add("Kidney");
        organs.add("Liver");
        organs.add("Blood");
    }

    public ArrayList<Donors> getDonorsList() {
        return donorsList;
    }
    
    public Donors createDonor(int id, String donorName, int age, String gender, String bloodGroup, String contact,
            String address, String sign, String email, 
            String emergencyPOC, String emergencyPOC_Num, boolean isOrganAvailable, 
                List<String> organsList){
        Donors donor = new Donors();
        donor.setDonorID(id);
        donor.setDonorName(donorName);
        donor.setDonorAge(age);
        donor.setDonorGender(gender);
        donor.setDonorBloodGroup(bloodGroup);
        donor.setContact(contact);
        donor.setDonorAddress(address);
        donor.setSign(sign);
        donor.setEmail(email);
        donor.setpName(emergencyPOC);
        donor.setpContact(emergencyPOC_Num);
        donor.setIsOrganAvailibility(isOrganAvailable);
        donor.setOrganList( organsList);
        donorsList.add(donor);
        return donor;
    }
}
