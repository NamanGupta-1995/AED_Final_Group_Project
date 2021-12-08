/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author garima
 */
public class PatientsDirectory {
    private ArrayList<Patients> listOfPatient;

    public PatientsDirectory() {
        listOfPatient = new ArrayList();
    }

    public ArrayList<Patients> getListOfPatient() {
        return listOfPatient;
    }     
    
    
     public Patients createPatient(int id,String patientName,String patientAge,
             String gender,String contact, String speciality,String doctor,
             boolean isAlive, boolean isDonor, boolean isDirectDonor, ArrayList<String> organList,
             ArrayList<String> testDataList){
         Patients patient = new Patients(id, patientName, patientAge,gender, contact, speciality, doctor, isAlive, isDonor, isDirectDonor,organList,testDataList);
         listOfPatient.add(patient);
         return patient;
     }
}
