/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organ;

import java.util.ArrayList;

/**
 *
 * @author garima
 */
public class OrganDirectory {

 private ArrayList<Organ> OrganList;

    public OrganDirectory() {
        OrganList = new ArrayList<Organ>();
        Organ org1 = new Organ("Heart", "A Positive");
        Organ org2 = new Organ("Lungs", "A Positive");
        Organ org3 = new Organ("Kidney", "A Positive");
        
        OrganList.add(org1);
        OrganList.add(org2);
        OrganList.add(org3);
    }

    public ArrayList<Organ> getOrganList() {
        return OrganList;
    }

    public void setOrganList(ArrayList<Organ> OrganList) {
        this.OrganList = OrganList;
    }
    public void addOrgan(Organ o){
        
        OrganList.add(o);
     
    }
    
    public void removeOrgan(Organ o){
        OrganList.remove(o);
        
    }

}
