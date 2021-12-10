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
public class OrganMatchWorkRequest extends WorkRequest{
    Patients donpatient;
    Patients recpatient;
    String team;
    String organ;

    public Patients getDonpatient() {
        return donpatient;
    }

    public void setDonpatient(Patients donpatient) {
        this.donpatient = donpatient;
    }

    public Patients getRecpatient() {
        return recpatient;
    }

    public void setRecpatient(Patients recpatient) {
        this.recpatient = recpatient;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }

    
}

