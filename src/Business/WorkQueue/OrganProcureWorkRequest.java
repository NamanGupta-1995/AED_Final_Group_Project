/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Person.Patients;
import java.util.ArrayList;

/**
 *
 * @author namangupta
 */
public class OrganProcureWorkRequest extends WorkRequest{
    Patients patient;
    String team;
    private ArrayList<String> organList=new ArrayList<>();

    public ArrayList<String> getOrganList() {
        return organList;
    }

    public void setOrganList(ArrayList<String> organList) {
        this.organList = organList;
    }

    public void setPatientAccount(Patients patAccount) {
        patient=patAccount;
   }

    public Patients getPatient() {
        return patient;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return getPatient()+"";
    }
    
}
