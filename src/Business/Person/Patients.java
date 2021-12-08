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
public class Patients {
    private int patientId;
    private String patientName;
    private String patientAge;
    private String gender;
    private String contact;
    private String speciality;
    private String doctor;
    private boolean isAlive;
    private boolean isDonor;
    private boolean isDirectDonation;
    private ArrayList<String> organList;
    private ArrayList<String> testDataList;
    
    public Patients(int id, String name, String age,String gender, 
            String contact, String speciality, String doctor, boolean isAlive, boolean isDonor, 
            boolean isDirectdonation,ArrayList<String> organList, ArrayList<String> testDataList) {
        this.patientId = id;
        this.patientName = name;
        this.patientAge = age;
        this.contact = contact;
        this.speciality = speciality;
        this.doctor = doctor;
        this.isAlive = isAlive;
        this.isDonor = isDonor;
        this.isDirectDonation = isDirectdonation;
        this.organList=organList;
        this.testDataList=testDataList;
    }

    
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public boolean isIsDonor() {
        return isDonor;
    }

    public void setIsDonor(boolean isDonor) {
        this.isDonor = isDonor;
    }

    public boolean isIsDirectDonation() {
        return isDirectDonation;
    }

    public void setIsDirectDonation(boolean isDirectDonation) {
        this.isDirectDonation = isDirectDonation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList<String> getOrganList() {
        return organList;
    }

    public void setOrganList(ArrayList<String> organList) {
        this.organList = organList;
    }

    public ArrayList<String> getTestDataList() {
        return testDataList;
    }

    public void setTestDataList(ArrayList<String> testDataList) {
        this.testDataList = testDataList;
    }

    @Override
    public String toString() {
        return ""+patientId ;
    }
    
    
    
}
